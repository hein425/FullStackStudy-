package com.jhi.ex04.conf;

import com.jhi.ex04.Obj.AA;
import com.jhi.ex04.Obj.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jhi.ex04.Obj")
public class Myconf {
    @Bean
    public AA aa(){
        return new AA();
    }

    public BB bb(){ return new BB(); }

}
