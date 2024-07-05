//1


public class AA {
    public static void main(String[] args) {
        // 브레이크는 와일 포 스위치 빠져나오기
        int sum = 0;

        for (int i = 0; ; i++) {
            System.out.println("i is " + i);
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
            System.out.println("중간썸= " + sum);

            if (sum == 100) break;
        }
        System.out.println(sum);
    }
}
