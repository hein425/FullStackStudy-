package com.pmh.org.login;


import com.pmh.org.user.User;
import com.pmh.org.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class LoginService implements UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;


    public void join(JoinDto joinDto){
        User user = modelMapper.map(joinDto , User.class);
        // username -> name
        user.setName(joinDto.getUsername());

        //암호화
        user.setPassword(
                passwordEncoder.encode(joinDto.getPassword())
        );

        user.setRole("ROLE_ADMIN");
//        user.setRole("ROLE_USER");

        User dbUser = userRepository.save(user);
        System.out.println(dbUser);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        //해당되는 이메일이 있는지 데이터베이스에서 확인
        //없으면 throw로 Usernamenotfoundexception 실행
        User user = userRepository.findByEmail(username).orElseThrow(
                () -> new UsernameNotFoundException(username)
        );


        // password 가 1234 이면 ADMIN 으로 로그인해라
        // username 은 아무렇게나 들어와도 된다.
        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getEmail())
                .password(user.getPassword())
//                .password(passwordEncoder.encode("1234"))
                .roles("ADMIN")
                .build();
    }
}
