package ex06;
//for중첩으로 구구단 만들기
public class Ex02 {
	public static void main(String[] args) {
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
											
				if(j==4)
					continue;
				
				System.out.println(i+" x "+j+" = "+i*j);
				
				
			}
			System.out.println("=========");
		}
		
	}

}
//continue 가 먼지 잘 모르겟다