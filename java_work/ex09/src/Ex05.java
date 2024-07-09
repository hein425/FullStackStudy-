/*
Math.random으로 가위바위보 게임 만들어보자
가위바위보 중 하나 입력받음 컴퓨터는 하나 선택
비교해서 승패 가르는 프로그램
사용자가 질때까지 계속 마지막엔 승무패 출력
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 0;
        int d = 0;
        int l = 0;
        while (true) {
            int a = (int) ((Math.random() * 3));

            System.out.println("=======================");
            System.out.println("가위바위보 하자" + "\n" + "0:가위 1:바위 2:보 중에 하나 입력 ㄱ");
            System.out.println("(알파고가 뭐 내는지 미리보는 핵)=> " + a);

            int p = sc.nextInt();

            System.out.println("player: " + p);
            System.out.println("PC: " + a);

            //컴퓨터가 가위 인 경우
            if (a == 0 && p == 1) {
                System.out.println("!!!you win!!!");
                w += 1;
            } else if (a == 0 && p == 0) {
                System.out.println("~~~draw~~~");
                d += 1;
            } else if (a == 0 && p == 2) {
                System.out.println("ㅋㅋ you lose ㅋㅋ");
                l += 1;
                break;
            }

            //컴퓨터가 바위 인 경우
            if (a == 1 && p == 2) {
                System.out.println("!!!you win!!!");
                w += 1;
            } else if (a == 1 && p == 1) {
                System.out.println("~~~draw~~~");
                d += 1;
            } else if (a == 1 && p == 0) {
                System.out.println("ㅋㅋ you lose ㅋㅋ");
                l += 1;
                break;
            }

            //컴퓨터가 보 인 경우
            if (a == 2 && p == 0) {
                System.out.println("!!!you win!!!");
                w += 1;
            } else if (a == 2 && p == 2) {
                System.out.println("~~~draw~~~");
                d += 1;
            } else if (a == 2 && p == 1) {
                System.out.println("ㅋㅋ you lose ㅋㅋ");
                l += 1;
                break;
            }
        }
        System.out.println("전적: " + w + "승" + d + "무" + l + "패");
    }
}
