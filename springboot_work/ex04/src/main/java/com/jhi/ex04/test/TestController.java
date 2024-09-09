package com.jhi.ex04.test;

import com.jhi.ex04.Obj.AA;
import com.jhi.ex04.Obj.BB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class TestController {

    //스프링 컨테이너에서 관리하는 방식
    private final AA aa;
    private final BB bb;

    //JVM직접 관리를 하고
    // AA aa = new AA();
    @GetMapping("aa")
    public String aa(){
        aa.doA();
        return "aaaaaaaaa";
    }

    @PostMapping("bb")
    public String bb(){
        bb.doB();
        return "bbbbbbb";
    }
}
