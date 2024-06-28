
//상수는 변경불가능, final, 대문자와 언더바 쓰는게 관례

package aa;

public class Ex07 {
	public static void main(String[] args) {
		
		final int MAX_SIZE = 100;
		System.out.println(MAX_SIZE);

	//	MAX_SIZE = 200;  <== 이러면 에러남
		
		final double AA = 200;
		System.out.println(AA);
		
		final String c = "변경불가";
		System.out.println(c);
		
		
		// 리터럴 자료형 기반 표현되는 상수
		// 정수는 무조건 int 형으로 인식, 실수는 무조건 double 형으로 인식
		// 5와 7은 실수형 리터럴이다 (리터럴 = 상수)
		float result = (float) (3.3 + 4.5);
		System.out.println(result);
		
		System.out.printf("정수는 %d 실수는 %f",10,20.33);
		// 프린트 에프는 줄바꿈 자동으로 안댐
		System.out.println(1321454578748654352L);
		// int 말고 long으로 해달라 하려면 L
		
		System.out.println(3.4*100000000);
		
		
	}

}


