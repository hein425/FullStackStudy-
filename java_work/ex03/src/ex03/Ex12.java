package ex03;

public class Ex12 {
	
	public static void main(String[] args) {
		
		int a =10;
		int b =10;
		
		boolean result;
		
		result =( (a+=10)<10 && (b+=10)>0 ); //앞에거가 어차피 f라서 뒤에건 안함
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
		result = (a+=10)<0 || (b+=10)>0;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
				
	
	}

}
