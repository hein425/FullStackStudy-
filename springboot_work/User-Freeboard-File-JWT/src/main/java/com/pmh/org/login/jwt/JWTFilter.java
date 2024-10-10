package com.pmh.org.login.jwt;

import com.pmh.org.login.LoginUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JWTFilter extends OncePerRequestFilter {

    private final JWTManager jwtManager;

    public JWTFilter(JWTManager jwtManager) {
        this.jwtManager = jwtManager;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {


        // 인증 토큰인 jwt가 null ㅇ이거나 bearer 로 시작하는 토큰이 아니라면
        String auth = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (auth == null || !auth.startsWith("Bearer")) {
            filterChain.doFilter(request, response);
        }

        // JWT 토큰이 유효한지 확인 해보는 함수
        // jwtManager.validJWT(auth);

        String token = auth.split("")[1];

        Jws<Claims> claims = jwtManager.getClaims(token);
        String email = claims.getPayload().get("email").toString();
//        String role = "ADMIN";
        String role = claims.getPayload().get("role").toString();

        LoginUserDetails loginUserDetails = new LoginUserDetails(email,null,role);


        Authentication authentication = new UsernamePasswordAuthenticationToken(
            loginUserDetails, null,loginUserDetails.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);


        filterChain.doFilter(request,response);
    }
}