/*
1. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
        단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
이 두 함수를 호출하는 방식으로 프로그램을 완성하자.

2.
길이가 10인 배열을 선언하고 총 10개의 정수를 입력받는다.
        단, 입력받은 숫자가 홀수이면 배열의 앞에서부터 채워나가고,
짝수이면 뒤에서부터 채워나가는 형식을 취하기로 하자.
따라서 사용자가 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]을 입력했다면,
배열에는 [1, 3, 5, 7, 9, 10, 8, 6, 4, 2]의 순으로 저장이 되어야 한다.

3.
        7개의 정수를 입력받아 내림차순으로 정렬하는 프로그램을 만들어라
        사용자가
6,9,15,3,2,11,20 입력했다면
20,15,11,9,6,3,2 출력되어야 한다.
*/

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("숫자를 열개 입력해 보세요");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
           // System.out.print(a[i] + ",");

            if((a[i])%2==0){
                System.out.print("짝수)"+a[i]+",");
            }else{
                System.out.println("홀수)"+a[i]+",");
            }
        }
    }

    public static void hol(int num{

    }

    public static void zak(){

    }


}
