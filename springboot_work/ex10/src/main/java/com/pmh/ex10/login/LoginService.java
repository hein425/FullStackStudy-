package com.pmh.ex10.login;


import com.pmh.ex10.user.User;
import com.pmh.ex10.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginService {
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
}
