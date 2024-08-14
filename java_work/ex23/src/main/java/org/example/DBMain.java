package org.example;

import java.util.Scanner;

public class DBMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DBRepository dbRepository = new DBRepository();

        while (true) {
            System.out.println("""
                    뭐할래?
                    1.입력
                    2.조회
                    3.수정
                    4.삭제
                    5.종료
                    """);
            int cho = sc.nextInt();
            //인서트실행
            if (cho == 1) {
                dbRepository.insert();
            }
            //셀렉트 실행
            else if (cho == 2) {
                dbRepository.select();
            } else {
                System.out.println("종료합니다");
                break;
            }
        }
    }
}