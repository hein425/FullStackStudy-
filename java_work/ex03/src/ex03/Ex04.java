package ex03;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//강제 형변환
		// int 는 4바이트 short는 2바이트
		// int 할당공간이 더 크다 표현숫자도 더 크다 그걸 short에 넣으면 "데이터소실"이 일어남
		
		int num1 = 413514651;
		short num2 = (short)num1; // 그 데이터소실을 감수하고 강제형변환 하겠다는 뜻 
		
		//자동 형변환 (작은 쪽에서 큰쪽으로는 자동으로 됨)
		short num3 = 20;
		int num4 = num3;
		
		short kk = 20;
		double aa = 10.03;
		
		kk = (short) aa;
		
		
	}

}
