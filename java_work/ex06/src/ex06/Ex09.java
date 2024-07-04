package ex06;

import java.util.Scanner;

//제어문 1 입력하면 doA 함수 호출
//제어문 2 입력하면 doB 함수 호출
public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1이나2를 써보세용: ");
		
		int select = sc.nextInt();
		
		if(select==1)
			doA();
		else if(select==2)
			doB();
		
	}
	
	public static void doA() {
		System.out.println("doA함수");
	}
	
	public static void doB() {
		System.out.println("doB함수");
	}

}
