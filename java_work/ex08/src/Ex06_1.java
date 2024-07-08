import java.util.Scanner;

/*
1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
그리고 그에 따른 적절한 함수를 구현해 보자.
참고로 재귀 함수의 구현이 처음에는 어려운 편이기 때문에 여기서는 쉬운 문제를 제시하였다
 */
public class Ex06_1 {
    public static void main(String[] args) {

        System.out.println("2의 몇제곱을 구하고 싶으세요?");

        Scanner sc = new Scanner(System.in);

        int vvs = sc.nextByte();
        int SQ = 1;

        for (int a = 1; a <= vvs; a++) {
            System.out.println(a);
            for(int b=2; b==a ;b*=1){
                System.out.println("====="+b);
            }


        }


    }
}
