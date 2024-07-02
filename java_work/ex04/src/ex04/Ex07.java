package ex04;

//삼항연산자
public class Ex07 {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//		String result = a > b ? "a는 b보다 큽니다." : "a는 b보다 작습니다.";	<=== 삼항연산자
//						//조건 참이면 앞에거 거짓이면 뒤에거 를 result 에 넣음
//		
//		System.out.println(result);
//		

		int a = 10;
		int b = 20;
		String result = "";

		if(a>b) {
			result = "a는 b보다 큽니다.";
		}else {
			result = "a는 b보다 작습니다.";
		}
		
		System.out.println(result);
	}

}
