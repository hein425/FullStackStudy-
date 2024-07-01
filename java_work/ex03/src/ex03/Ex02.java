

package ex03;

import java.util.Scanner; // 이게 있어야 스캐너 작동함

public class Ex02 {
	
	// 컴퓨터 근본은 계산기
	
	public static void main(String[] args) {
		
		//숫자 입력받아서 두 수의 합 구하기
		
		int a ;
		int b ;
		
		Scanner scan= new Scanner(System.in); // 뭔가를 입력받아 사용할때 쓰는 문법
		
		System.out.println("숫자 입력");
		
		// a변수에 숫자 입력 받아 넣는 구문.
		a = scan.nextInt();
		System.out.println("a="+a);
		
		
		b = scan.nextInt();
		System.out.println("b="+b);
	}

}
