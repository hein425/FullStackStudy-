package ex03;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// 컨트롤 +1 => 빠른 에러처리
		
		double a = 10.345;
		int b = (int)a;
		System.out.println(a);
		System.out.println(b);
		
//		a= 11.39;   위에 있는 로컬변수 a 랑 이름 겹쳐서 double 적으면 에러남.
//	    b= (int)a; 
//		System.out.println(a);
//		System.out.println(b);
		
		double c = 11.39;
		int d = (int) a;
		System.out.println(c);
		System.out.println(d);
	}

}
