//구구단의 일부를 다음같이 출력하세용
//        2*1=2    3*1=3
//        2*2=4    3*2=6
//        2*3=6    3*3=9
//        이런식으로 9단까지 *3만
import java.util.Scanner;
public class Ex06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.println(A/B);
    }
}
