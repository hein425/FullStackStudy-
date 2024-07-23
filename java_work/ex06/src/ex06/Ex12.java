package ex06;

//1+(-2)+3+(-4)+... 이런식으로 할때 몇까지 더해야 총합이 100이 되노?
public class Ex12 {
	public static void main(String[] args) {
// ㅑ를 1부터 올려가면서 홀수는 더하고 짝수는 뺴는 스크립트

		int i = 0;
		int sum = 0;

		while (true) {
			i++;
			if (i % 2 == 0) {
				i += i;
			} else {
				i -= i;
			}

			sum = sum + i;

			if (sum == 100)
				break;
			
			System.out.println(sum);
		}
	}
}
