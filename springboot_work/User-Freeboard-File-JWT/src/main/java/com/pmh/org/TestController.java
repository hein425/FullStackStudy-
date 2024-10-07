package com.pmh.org;


import lombok.RequiredArgsConstructor;
import org.hibernate.cfg.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {

    private final Environment environment;
    // @Value("${spring.jwt.secret}")
    private final String secretKey;

    public TestController(Environment environment){
        this.environment = environment;
        this.secretKey = environment.getProperty("spring.jwt.secret");
    }


//    @GetMapping("env")
//    public String env(){
//
//        String key = environment.getProperty("spring.jwt.secret");
//        System.out.println(key);
//
//
//        return "env";
//    }

    @GetMapping("maketoken")
    public String maketoken(){
        System.out.println("maketoken");
        return "maketoken";
    }

    @GetMapping("validtoken")
    public String validtoken(){
        System.out.println("validtoken");
        return "validtoken";
    }
}
