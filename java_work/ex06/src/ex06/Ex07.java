package ex06;
//메소드 리턴
public class Ex07 {

	public static void main(String[] args) {
		int result = doA(3);
		String temp = doB("하이용");

		System.out.println(result);
		System.out.println(temp);
		// 위나 아래나 똑같다 
		System.out.println(doA(3));
		System.out.println(doB("하이용"));
		
	}

	public static int doA(int num) {
		return num * num;
	}

	public static String doB(String str) {
		return str + str;
	}
}
