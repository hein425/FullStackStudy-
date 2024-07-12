import java.util.Arrays;

//1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
public class Ex10_1 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(a));

        int sum = 0;
        int p = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            sum = sum+a[i];
            p = (sum/a.length);
        }
        System.out.println(sum);
        System.out.println(p);
    }
}
