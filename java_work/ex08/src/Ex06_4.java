/*
4.두 개의 정수를 입력받아서 최대 공약수(GCD)를 구하는 프로그램을 작성해 보자.
 */

import java.util.Scanner;

public class Ex06_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력해 보세요");

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1 ; a%i == 0 && b%i == 0; i++) {
            System.out.println("i="+i);

        }
    }
}
