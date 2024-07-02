package ex04;

//변수 num 값에 따라 양수 음수 0 을 출력하는 코드이다. 삼항연산자로 맞는걸 넣어라.
public class exam02 {
	public static void main(String[] args) {
		int num = 100;
		String result = "";

		if (num > 0) {
			result = "num은 양수 입니다.";
		} else if (num == 0) {
			result = "num은 0 입니다.";
		} else {
			result = "num은 음수 입니다.";
		}

		System.out.println(result);

		System.out.println(num > 0 ? "num은 양수입니다." : "num은 음수입니다.");
		System.out.println(num == 0 ? "num은 0입니다." : "num은 0이 아입니다.");
	}

}
