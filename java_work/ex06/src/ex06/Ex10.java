package ex06;

// 1부터 20까지 정수중 2또는3의 배수가 아닌 수의 총합을 구하시오    *어디 담아서 증가대입
// 1+(1+2)+(1+2+3)+...+(1+...+10) 의 결과를 계산하시오
// 1+(-2)+3+(-4)+... 이런식으로 할때 몇까지 더해야 총합이 100이 되노?
// for 문을 while 문으로 바꿔
// 
//  다한사람은 위 문제들을 함수호출로 바꿔봐

public class Ex10 {

	public static void main(String[] args) {

		int s = 0;

		for (int a = 0; a <= 20; a++) {

			if (a % 2 != 0 && a % 3 != 0) {
				System.out.println(a);
				s += a;
			}

		}
		System.out.println(s);
	}
}

