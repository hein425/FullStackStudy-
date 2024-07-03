package ex05;

public class Ex10 {
	public static void main(String[] args) {
		// 3,4의 최소공배수
		
		//break 만나면 switch while for 탈출한다.
		
		int num = 1;
		
		for(;num<100;num++) {
			
			if(num%3==0&&num%4==0){
			
			System.out.println("num="+num);
			break;
			}
			
			
		}
	}

}
