package org.example;
/*
바카라.(베팅 규칙은 무시.)
플레이어 뱅커 서드카드 룰을 익힐수 있다
 */

import java.util.Scanner;

public class Baccarat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Bet down please, any more bet?? (y/n)");

            char c = sc.next().charAt(0);
            if(c=='n'){break;}

            while (true) {

                int a = 0;

                int pfir = (int) (Math.random() * 10);
                int psec = (int) (Math.random() * 10);
                int Psum = pfir + psec;
                if (Psum >= 10)
                    Psum = Psum % 10;

                System.out.println("Player: " + pfir + " " + psec + " ==>> " + Psum);

                int bfir = (int) (Math.random() * 10);
                int bsec = (int) (Math.random() * 10);
                int Bsum = bfir + bsec;
                if (Bsum >= 10)
                    Bsum = Bsum % 10;

                System.out.println("Banker: " + bfir + " " + bsec + " ==>> " + Bsum);
                // 여기까지 플레이어 뱅커 카두 두장 돌리기

                //내추럴
                if ((Psum == 8 || Psum == 9) && Psum > Bsum) {
                    System.out.println("~~Player <<NATURAL>> WIN~~");
                    break;
                }
                if ((Bsum == 8 || Bsum == 9) && Psum < Bsum) {
                    System.out.println("~~Banker <<NATURAL>> WIN~~");
                    break;
                }
                if ((Bsum == 8 || Bsum == 9) && (Psum == 8 || Psum == 9) && (Psum == Bsum)) {
                    System.out.println("Player Natural, also Banker Natural TIE");
                    break;
                }
                //내추럴

                //플레이어 서드카드 룰
                if (0 <= Psum && Psum <= 5) { // 플레이어 두장 합이 0~5면 서드카드 추가, 6,7이면 스탠드
                    int pthd = (int) (Math.random() * 10);
                    Psum = pfir + psec + pthd;
                    if (Psum >= 10)
                        Psum = Psum % 10;
                    System.out.println("ㄴPlayer: " + pfir + " " + psec + " " + pthd + " ==>> " + Psum);
                    a += pthd;
                }


                //뱅커 서드카드 룰
                if ((Psum == 6 || Psum == 7) && (0 <= Bsum && Bsum <= 5)) { //플레이어가 6,7 스탠드일때, 뱅커 두장합이 0~5면 서드 받는다.
                    int bthd = (int) (Math.random() * 10);
                    Bsum = bfir + bsec + bthd;
                    if (Bsum >= 10)
                        Bsum = Bsum % 10;
                    System.out.println("ㄴBanker: " + bfir + " " + bsec + " " + bthd + " ==>> " + Bsum);
                }


                //플레이어 서드카드에 따른 뱅커 서드카드 룰
                if (0 <= Bsum && Bsum <= 2) { //뱅커 두장 합이 0~2면 한장더 받는다
                    int bthd = (int) (Math.random() * 10);
                    Bsum = bfir + bsec + bthd;
                    if (Bsum >= 10)
                        Bsum = Bsum % 10;
                    System.out.println("ㄴBanker: " + bfir + " " + bsec + " " + bthd + " ==>> " + Bsum);

                } else if ((Bsum == 3) && (a != 8)) { //뱅커 두장 합이 3, 플레이어 서드카드가 8이 아니라면 받는다.
                    int bthd = (int) (Math.random() * 10);
                    Bsum = bfir + bsec + bthd;
                    if (Bsum >= 10)
                        Bsum = Bsum % 10;
                    System.out.println("ㄴBanker: " + bfir + " " + bsec + " " + bthd + " ==>> " + Bsum);

                } else if (Bsum == 4 && (2 <= a && a <= 7)) { //뱅커 두장 합이 4, 플레이어 서드카드가 2~7이면 받는다
                    int bthd = (int) (Math.random() * 10);
                    Bsum = bfir + bsec + bthd;
                    if (Bsum >= 10)
                        Bsum = Bsum % 10;
                    System.out.println("ㄴBanker: " + bfir + " " + bsec + " " + bthd + " ==>> " + Bsum);

                } else if (Bsum == 5 && (4 <= a && a <= 7)) { //뱅커 두장 합이 5, 플레이어 서드카드가 4~7이면 받는다.
                    int bthd = (int) (Math.random() * 10);
                    Bsum = bfir + bsec + bthd;
                    if (Bsum >= 10)
                        Bsum = Bsum % 10;
                    System.out.println("ㄴBanker: " + bfir + " " + bsec + " " + bthd + " ==>> " + Bsum);

                } else if (Bsum == 6 && (6 <= a && a <= 7)) { //뱅커 두장 합이 6, 플레이어 서드카드가 6,7이면 받는다.
                    int bthd = (int) (Math.random() * 10);
                    Bsum = bfir + bsec + bthd;
                    if (Bsum >= 10)
                        Bsum = Bsum % 10;
                    System.out.println("ㄴBanker: " + bfir + " " + bsec + " " + bthd + " ==>> " + Bsum);

                }

                //승무패 판정
                 if (Psum > Bsum) {
                    System.out.println("!! Player WIN !!");
                    break;
                } else if (Psum == Bsum) {
                    System.out.println("/// TIE ///");
                    break;
                } else {
                    System.out.println("!! Banker WIN !!");
                    break;
                }
            }
        }
    }
}