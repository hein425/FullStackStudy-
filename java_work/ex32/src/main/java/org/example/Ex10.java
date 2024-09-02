package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {

    private MemberRepository memberRepository = new MemberRepository();

    Ex10() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    뭐 하실래요?
                    0. login
                    1. member select()
                    2. member insert()
                    3. member update()
                    4. member delete()
                    5. todo select()
                    6. todo insert()
                    7. todo update()
                    8. todo delete()
                    """);
            int ra = sc.nextInt();

            if (ra == 1) {
                memberRepository.select();
            } else if (ra == 2) {
                memberRepository.insert();
            } else {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Ex10();
    }
}
