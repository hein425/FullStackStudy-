package ex04;
// 이프 엘즈
public class Ex05 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("true 실행");
		} else {
			int c = 30; // 이 c 는 else 안 이 줄에서만 존재해서 딴데서는 안댐
             			// else 밖으로 나가면 c는 사라짐
			System.out.println("많이 출력");
			System.out.println("false실행");


			System.out.println(c);
		}
	}
}
