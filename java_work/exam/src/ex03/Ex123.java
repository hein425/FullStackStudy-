package ex03;

import java.util.Scanner;

public class Ex123 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 쳐보소");
		double doubleValue = scan.nextDouble();
		
		int intValue = (int) (doubleValue*100);
				
		System.out.println(doubleValue);
		System.out.println(intValue);
		System.out.println(intValue/(double)100);
		
				
	}

}
