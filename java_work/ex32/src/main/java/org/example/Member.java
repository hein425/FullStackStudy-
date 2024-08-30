package org.example;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    private int idx;
    private String name;
    private int age;
    private String email;
    private String password;
    private LocalDateTime regdate;
    private LocalDateTime mydate;




}
