package ex05;

public class Ex119 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++)<100) {
			if((num%5)!=0||(num%7)!=0) {
				continue;
			}
			
			count++;
		}
	}
	
	
}
