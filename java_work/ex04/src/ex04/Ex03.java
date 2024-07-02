package ex04;
// 증가 감소 연산자
public class Ex03 {
	public static void main(String[] args) {
		
		int num1 = 10;
		/*
		 * 브레이크포인트 더븙클릭
		 * 벌레모양 디버그모드 
		 * f6 한줄씩 진행
		 * f8 레주메 종료
		 */
		
		//num++		  ]
		//num = num+1 ] 똑같다
		//num += 1	  ]
		
		System.out.println(num1++);// 출력하고 나서 1 증가
		System.out.println(++num1);// 증가시키고 나서 출력
		
		System.out.println(num1);
		
		
		System.out.println(num1--);
		System.out.println(--num1);
		
		System.out.println(num1);
		
		
			//초기값     조건   1증가  4씩 늘리고 싶으면 i=i+4
		for (int i =0; i<10; i++) {
			System.out.println(i);
			System.out.println("ㅎㅎㅎ");
			System.out.println(i+i);
		} // for=~동안행하라 // i는 10보다 작은 동안 0부터 1씩 증가시켜라
	}

}
