package org.example;

import java.util.Scanner;

public class Todomain
{

    private String info= """
            뭐할래?
                0. 로그인
                1. member select()
                2. member insert()
                3. member update()
                4. member delete()
                5. todo select() -> user 사용자
                6. todo insert() -> user 정보...
                7. todo update()
                8. todo delete()
            """;


    private MemberRepository memberRepository =
            new MemberRepository();

    Todomain(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("""
                뭐할래?
                0. 로그인
                1. member select()
                2. member insert()
                3. member update()
                4. member delete()
                5. todo select() -> user 사용자
                6. todo insert() -> user 정보...
                7. todo update()
                8. todo delete()
                """);
            int ra = scanner.nextInt();


            if (ra == 0) {
                System.out.println("어떤 사용자 할래");
                int member_idx = scanner.nextInt();
            }
            else if (ra == 1) {
                memberRepository.select();
            } else if (ra == 2) {
                memberRepository.insert();
            }
            else{
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Todomain();
    }

}