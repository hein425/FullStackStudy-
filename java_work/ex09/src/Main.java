
/*
1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
그리고 그에 따른 적절한 함수를 구현해 보자.
참고로 재귀 함수의 구현이 처음에는 어려운 편이기 때문에 여기서는
쉬운 문제를 제시하였다
 */

import java.util.Scanner;
import aa.bb.Fact;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ㄴ입력받는 변수 선언

        System.out.println("2의 몇 제곱을 원하십니까");
        int result = sc.nextInt();

        Fact fact1 = new Fact();
        int retValue = fact1.aa(result);

        System.out.println("result= "+ result);
        System.out.println("retValue= "+retValue);
    }
}



