package ex04;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 써보세요");
		int num1 = scan.nextInt();
		
		System.out.println(num1);
		
		if(num1<10) {
			System.out.println(num1+"는(은) 10 미만입니다. ");
		}else if(10<=num1 && num1 <=20){
			System.out.println(num1+"는(은)10 이상이고 20 이하입니다.");
		}else {
			System.out.println(num1+"는(은) 20 초과입니다.");
		}
		
	}

}
