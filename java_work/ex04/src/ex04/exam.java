package ex04;
/*
 * 
 *  사과를 담는데 필요한 바구니 수를 구하는 코드이다. 사과의 수는 123개
 *  한 바구니에는 10개가 담김. 13개가 필요할것, (1)에 맞는걸 넣으시오
 * 
 */
class Exec3_2 {
	
	public static void main(String[] args) {
		int numOFApples = 123;
		int sizeOFBucket = 10;
		int numOFBucket = (numOFApples)/(sizeOFBucket);
		
		System.out.println("필요한 바구니의 수"+numOFBucket);
	}
}

// 변수 num 값에 따라 양수 음수 0 을 출력하는 코드이다. 삼항연산자로 맞는걸 넣어라.
class Exe3_3{
	public static void main(String[] args) {
		int num = 456;
		String result = "";
		if(num>0){
			result ="num은 양수 입니다.";
		}else if(num==0){
			result ="num은 0 입니다.";
		}else{
			result ="num은 음수 입니다.";
		}
		System.out.println(result);
	}
}
//변수 num값 중에서 백의자리 이하를 버리는 코드. EX) 456 => 400 , 111 => 100
class Exe3_4{
	public static void main(String[] args) {
		int num = 456;
		
		
		System.out.println(num/100*100);
		
	}
	
}
// 아래는 화씨를 섭씨로 바꾸는 코드. 변환공식은 C=(F-32)/1.8 결과값은 소수 셋째자리에서 버림.
class Exe3_7{
	public static void main(String[] args) {
		int F = 100;
		float C = (1);
		
		
		System.out.println("F="+F);
		System.out.println("C="+C);
	}
}




















