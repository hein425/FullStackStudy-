import java.util.Scanner;
//3. 프로그램 사용자로부터 10진수 형태로 정수를 하나 입력받은 다음, 이를 2진수로 변환해서 출력하는 프로그램을 작성해 보자.
public class Ex10_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a 를 2로 계속 나눠서 그 나머지를 배열에 집어넣고 그걸 거꾸로 쓰면 됌
        System.out.println("2진수로 바꾸고 싶은 정수를 써보세요");
        int a = sc.nextInt();
        String v = "" ;

        for(; a>0; a/=2){
            System.out.println(a);
            int b = a%2;
            System.out.println("나머지는 -> "+b);
            v= v+b;
        }

        System.out.println(v);

        char EE[] = v.toCharArray();

        for(int i=(EE.length)-1 ; i >= 0 ; i--){

            System.out.print(EE[i]);
        }
    }
}
