
package ex04;
//변수 num값 중에서 백의자리 이하를 버리는 코드. EX) 456 => 400 , 111 => 100

public class exam03 {
	public static void main(String[] args) {

		int num = 456;

		System.out.println(num / 100 * 100);
	}

}
