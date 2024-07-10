import java.util.Scanner;

/*
2.피보나치 수열은 앞 두 수를 더해서 다음 수를 만들어 나가는 수열.
  예를 들어  1,1,2,3,5,8,13,21....
  피보나치 수열 10번째 수를 계산하는 프로그램 만드세용

3. 구구단의 일부를 다음같이 출력하세용
   2*1=2    3*1=3
   2*2=4    3*2=6
   2*3=6    3*3=9 이런식으로 9단까지 *3만
 */

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("피보나치 수열로 10번째 수를 찾아드립니다 아무 숫자나 두개 써보세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
        b=a+b;
        System.out.println(b);
    }
}
