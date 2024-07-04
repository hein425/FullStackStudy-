package ex06;

import java.util.Scanner;

// 메소드 반복
public class Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("곱하고 싶은 값 입력: ");
			int input = sc.nextInt();
			
			System.out.println(input*input);
			//얘네 둘 똑같음
			System.out.println(doA(input));
		}
	}
	
	public static int doA(int num) {
		return num*num;
	}
	
	
}
