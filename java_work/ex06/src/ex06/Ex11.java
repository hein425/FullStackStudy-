package ex06;

// 1+(1+2)+(1+2+3)+...+(1+...+10) 의 결과를 계산하시오
public class Ex11 {
	public static void main(String[] args) {
		
		int a = 0;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < i + 2; j++) {
				System.out.println("j = " + j);
				
			 a= a+j;
			}
		}
		System.out.println(a);

	}

}
