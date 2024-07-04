package ex05;

public class sum {
	public static void main(String[] args) {

		int i = 1;

		for (; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("=========");

		while (10 < i && i <= 20) {

			System.out.println(i);

			i++;

		}
		// for(시작조건;반복조건;진행조건){반복내용}
		// while(반복조건){반복내용}-조건이 true인 경우 반복
		// -시작조건 입력할때 반드시 변수 초기화
		// -변수 초기화 이미 돼있으면 while 이 더 직관적
		// -가독성도 while이 좀더 나음
		// -파이썬에서는 for가 좀더 편함( 다양, 복잡 해서)
		
		
		//if는 t/f에 따라 실행/노실행 인데, 
		//switch 는 변수 값에 따라 실행결과를 따로 통제. 
		
	System.out.println("======");
	
		

	}
}
