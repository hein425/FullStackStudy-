package com.jhi.ex04.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

// 테이블 정의

@Entity //이거 테이블이야
@Table(name = "users") //테이블 이름 바꿀게
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long idx;

    private String name;
    private int age;

    @Column(length = 100, unique = true)
    private String email;
    @Column(length = 100)
    private String password;

    private LocalDateTime wdate;

}