package ex04;

import java.util.Scanner;

//변수 num 값에 따라 양수 음수 0 을 출력하는 코드이다. 삼항연산자로 맞는걸 넣어라.
public class hin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num = scan.nextDouble();
		
		
		System.out.println(num>0 ? "num 은 양수 입니다.":"num 은 음수 입니다.");
		System.out.println(num==0? "num은 0입니다.":"num은 0이 아닙니다.");
		
		
	}	
}
