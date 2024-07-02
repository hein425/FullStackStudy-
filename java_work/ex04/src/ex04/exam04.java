package ex04;

//아래는 화씨를 섭씨로 바꾸는 코드. 변환공식은 C=(F-32)/1.8 결과값은 소수 셋째자리에서 버림. 형변환써라
public class exam04 {
	public static void main(String[] args) {

		int F = 100;
		float C = (F - 32) / (float) 1.8;

		double X = C * 1000;
		int V = (int) X;
		double Z = (double) V / 1000;

		System.out.println("F=" + F);
		System.out.println("C=" + Z);
	}

}
