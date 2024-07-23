package org.example;
// alt 1 브라우저 경로
// esc 소스로 복귀
// alt insert 파일생성

import org.example.inter.Printable;
import org.example.print.LGprinter;
import org.example.print.Samprinter;

public class Main {
    public static void main(String[] args) {

        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);
//        Printable.HEIGHT = 90; final (예약이 붙어있어서 값 변경이 불가능하다.)

        Printable prn = new LGprinter();
        prn.print("내 문서");

        prn = new Samprinter();
        prn.print("내문서");

    }
}