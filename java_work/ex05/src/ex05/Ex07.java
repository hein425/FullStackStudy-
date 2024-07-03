package ex05;

// do~while문 
// do  안에 잇는걸 먼저 실행하고 조건으로 가자

public class Ex07 {
	public static void main(String[] args) {
		
		int n =10;
		
//		do {
//			
//			System.out.println(n);
//			n--;
//			
//		}while(n>8); // n--를 8과 비교해서 크면 다시 위로 올라가서 재진입 함
		
		while(n>8){
			System.out.println(n);
			n--;
			
		}
	}

}
