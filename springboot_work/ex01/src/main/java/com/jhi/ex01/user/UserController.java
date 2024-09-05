package com.jhi.ex01.user;

import com.jhi.ex01.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("member/insert")
    public String aa(@RequestParam (name = "name" ,defaultValue = "내이름" )String name,
                     @RequestParam (name = "age", defaultValue = "30")int age){

        System.out.println("name = "+name);
        System.out.println("age = "+age);
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name,age);

        return "membertable 에 저장햇어요";
    }

    @GetMapping("bb")
    public String bb(){
        return "bb";
    }
}
