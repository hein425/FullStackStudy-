package com.lsj.ex08.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class JpaAuditConfig {

    @Bean
    public AuditorAware<String> auditorAware(){

        AuditorAware<String> auditorAware =
                () -> Optional.of("홍길동");

        return auditorAware;


    }
// 어노테이션 크리에이트 , 라스트 모디파이 쓸수잇게
}
