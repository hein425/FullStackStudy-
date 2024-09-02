package org.example;

import lombok.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
//@ToString
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

    @Override
    public String toString() {
        String temp = mydate==null?"": DateTimeFormatter.ofPattern("yyyy/mm/dd").format(mydate);

        return "Member{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", regdate=" + regdate +
                ", mydate=" + temp +
                '}';
    }
}
