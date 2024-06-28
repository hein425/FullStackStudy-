package aa;

public class Ex03 {
	public static void main(String[] args) {

		// byte - short - int cpu 32비트라면
		// int 는 4바이트
		// short는 2바이트
		// 기본적으로 int로 연산
		//0000 0000 0000 0000 16개 
		//0000 0000 0000 0000 0000 0000 0000 0000 32
		//int 형 연산을 한걸 short에 넣으려고 해서 에러가 남
		
		short a = 11;
		short b = 22;
		
		// ctrl + 1 -> 에러 바로 수정
		
		short result = (short) (a + b);
		
		System.out.println(a + b);
		System.out.println(result);
	}

}
