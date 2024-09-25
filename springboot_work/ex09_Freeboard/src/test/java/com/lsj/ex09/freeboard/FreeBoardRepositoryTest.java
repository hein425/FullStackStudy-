//package com.lsj.ex08.freeboard;
//import com.lsj.ex08.user.User;
//import com.lsj.ex08.user.UserRepository;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import java.util.List;
//
//@SpringBootTest
//class FreeBoardRepositoryTest {
//
//    @Autowired
//    FreeBoardRepository freeBoardRepository;
//
//    @Autowired
//    UserRepository userRepository;
//    // 이걸로 해곃ㄹ해도 돼고 케스케이드로 해결해도 된다.
//    // 종속된 표현이라는 뜻
//
//    @Test
//    void insertTest(){
//        User user = User.builder()
//                        .name("haein")
//                        .age(17)
//                        .email("bzzxb@gmail.com")
//                        .password("pwwwd")
//                        .build();
//
////        userRepository.save(user);
//
//        FreeBoard freeBoard = FreeBoard.builder()
//                        .title("wodfasa")
//                        .content("sazzzzzzyd")
//                        .user(user)
//                        .build();
//
//        freeBoardRepository.save(freeBoard);
//    }
//
//    @Test
//    @Transactional // 테스트로 했떤거 인서트 다시 삭제해줌
//    void selectTest(){
//        List<FreeBoard> list =  freeBoardRepository.findAll();
//        list.stream().forEach(System.out::println);
//        //포린키로 연결된 거 까지 가져오는 증상이 있다.
//    }
//
//    @Test
//    void deleteTest(){
//        freeBoardRepository.deleteById(3l);
//    }
//
//    @Test
//    void updateTest(){
//        User user = User.builder()
//                .name("haein")
//                .age(17)
//                .email("b544b@gmail.com")
//                .password("pwwwd")
//                .build();
//
//
//        FreeBoard freeBoard = FreeBoard.builder()
//                .idx(4l)
//                .title("제목")
//                .content("내용")
//                .user(user)
//                .build();
//
//        freeBoardRepository.save(freeBoard);
//    }
//}