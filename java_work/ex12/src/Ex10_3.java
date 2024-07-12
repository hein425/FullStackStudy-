//4. 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성해보자
//   입력 abcdef  출력 fedcba

import java.util.Scanner;

public class Ex10_3 {
    public static void main(String[] args) {
        System.out.println("아무말이나해봐");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(str);

        char chars[] = str.toCharArray();

        for(int i=(chars.length)-1 ; i >= 0 ; i--){
            System.out.print(chars[i]);
        }

    }
}
