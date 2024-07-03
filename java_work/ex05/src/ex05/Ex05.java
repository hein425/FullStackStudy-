package ex05;

public class Ex05 {
	public static void main(String[] args) {
		
		int n = 2;
		
		switch (n) { //스위치브레이크 구문
		case 1:
			System.out.println("n은 1입니다.");
			break;
		case 2:
			System.out.println("n은 2입니다.");
		case 3:
			System.out.println("n은 3입니다.");
		case 4:
			System.out.println("n은 4입니다.");
			break;    // 케이스마다 브레이크 있는것과 없는것의 차이를 느껴라
		default:
			System.out.println("기본");
			break;
		}
		
		System.out.println("종료합니다.");
		
		// 위에거랑 아래거랑 결과는 같음 원하는거 쓰시오
		
		if(n==1) {
			System.out.println("n은1디ㅏ");
		}else if(n==2||n==3||n==4) { //(2 <= n && n <=4)
			System.out.println("n은2입니다");
			System.out.println("n은3입니다");
			System.out.println("n은4입니다");
			
		}else {
			System.out.println("기본");
		}
		
		System.out.println("종료됩니다.");
	}

}
