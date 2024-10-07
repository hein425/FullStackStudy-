package com.pmh.org.jwt;

import io.jsonewebtoken.Jwts;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.Base64;


@Component
public class JWTManager {

    public String createJWT(String secrekey){
        String jwt = Jwts.builder()
                .claim("username","aaa.@naver.com")
                .claim("role","ADMIN")
                .issuedAt(new Date(System.currentTimeMillis())) // 현재시간넣기
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24)) // 1일 유효함
                .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encodeToString(secrekey.getBytes()))
                .compact;

        return jwt;
    }
}
