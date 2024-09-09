package com.jhi.ex04.user;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

// 프론트에서 오는 파라메터의 검사

@Data
public class UserReqDto {


    private Long idx;

    private String name;
    private int age;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    private LocalDateTime wdate;
}
