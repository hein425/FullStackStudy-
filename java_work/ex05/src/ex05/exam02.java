package ex05;

import java.util.Scanner;

//변수 num 값에 따라 양수 음수 0 을 출력하는 코드이다. 삼항연산자로 맞는걸 넣어라.
public class exam02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력:  ");
		int num = scan.nextInt();
		
		System.out.println("num ="+num);
		System.out.println("num ="+num+(num>0? "양수입니다.": num == 0?"0입니다." :"음수입니다."));
		

	}

}
