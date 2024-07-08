import java.util.Scanner;

/*
2. 프로그램 사용자로부터 초(second)를 입력받은 후에,
 이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해 보자.
 */
public class Ex06_2 {
    public static void main(String[] args) {
        System.out.println("몇초를 바꿀래요?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //a/3600 = 시간  a/60= 분   a=초
        int h = a/3600;
        int m = (a%3600)/60;
        int s = (a%3600)%60;

        System.out.println("["+h+" 시간 "+m+" 분 "+s+"초"+"]");

    }
}
