package com.jhi.ex03.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/*
 *   @콘피그레이션 => 객체 담는 통 정의
 *   @빈 => 그거 객체야
 *   @컴포넌트 => 그거도 객체야
 *   @컴포넌트스캔 => 패키지 내용 읽어서 객체주입해줘
 *   @오토와이어드=> 뉴 예약어 안쓰고 객체 자동 할당
 *   프라이빗 파이널 -> @리콰이어드앍컨스트럭터 -> 객체 자동할당
 *
 *   @엔티티 - 이거 테이블이야
 *   @테이블 -테이블 이름 바꿀게
 *   @아이디 - 기본키야 프라이머릴 키야
 */

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //오토인크리스먼트 이거 설정해줘
    private Long idx;

    private String name;
    private int age;

    private String email;
    private String password;

    private LocalDateTime wdate;

    // jap class -> 테이블 크리에이트가 됩니다.
}
