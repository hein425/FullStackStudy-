package com.pmh.ex10.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){ // 비번 암호화 클래스

        return new BCryptPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception{
                                                            // 일반 사용자의 접근을 가능하게 함
        http.authorizeHttpRequests( auth-> auth.requestMatchers("/login","/join","/","/freeboard/**","/user/**").permitAll()
                                                            // 어드민 롤을 가지고 있을때 접근 가능
                                                .requestMatchers("/admin").hasRole("ADMIN")
                                                .anyRequest().authenticated());

        http.sessionManagement( session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }



}
