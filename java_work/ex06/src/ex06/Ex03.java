package ex06;
// 메인 메소드 말고 다른 메소드 써먹기
public class Ex03 {
	public static void main(String[] args) {
		
		int k=20;
		System.out.println("===프로그램 시작===");
		hieveryone(12);
		hieveryone(13);
		System.out.println("===프로그램 끝===");
		
	
	}
	
	public static void hieveryone(int i) {
		
		System.out.println("여기온다"+i);
		if(i==12) {
			System.out.println("i는"+i+"입니다.");
		}
		
		for(int k=0;k<3;k++) {
			System.out.println("k="+k);
		}
	}
		
	

}
