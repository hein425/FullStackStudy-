import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        int br[] = new int[10];

        System.arraycopy(ar, 3, br, 2, 2);
//  ar의 세번째 부터 복사해서 br에 두번째부터 두개 붙여넣어라 라는 뜻
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br));
    }
}
