package ex06;
// ~~메소드와 변수 범위~~ (이전에 배운건 제어문)

// 메소드 두개
// 보낸 구구단 호출하는 메소드도 있음

public class Ex04 {

	public static void main(String[] args) {

		System.out.println("program start");
		aa(5);
		bb(3, 4);
		System.out.println("program end");

	}

	// 보낸는 구구단을 호출하는 메소드
	public static void aa(int dan) {
		System.out.println("aa");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan * i);
		}
	}

	// 두수를 받아서최소공배수를 출력하는 메소드
	public static void bb(int num1, int num2) {
		System.out.println("bb");
		int num = 0;
		while (num < 100) {
			num++;
			if (num % num1 == 0 && num % num2 == 0) {
				System.out.println("최소공배수는" + num + "입니다.");
			}

		}
	}

}
