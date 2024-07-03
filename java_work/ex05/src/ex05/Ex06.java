package ex05;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		      
		//계속 입력받아 진행.
		while(true) {
			    
			int num = scan.nextInt();
			System.out.println("num="+num);
			
			// break 만나면 while 문 탈출
			// break 만나면 switch 문 탈출
			
			if(num==0) {
				break;
			}
		}
		
		System.out.println("종료합니다.");
	}

}
