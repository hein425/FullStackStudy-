package com.pmh.org.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;

@RequiredArgsConstructor
public class LoginFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    // 로그인 시도할때 호출되는 메서드
    @Override
    public Authentication attemptAuthentication(
                        HttpServletRequest request,
                        HttpServletResponse response) throws AuthenticationException{
        System.out.println("로그인 시도");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("email = "+ email);
        System.out.println("password = "+ password);

        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken(email, password);
                return authenticationManager.authenticate(token);
    }



    //로그인 성공 호출 메소드... jwt 토큰 발행
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);
        System.out.println("성공");
        response.getWriter().write("success");
    }

    //로그인 실패
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        super.unsuccessfulAuthentication(request, response, failed);
        System.out.println("실패");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter()
                .write("plz check email and password");
    }
}
