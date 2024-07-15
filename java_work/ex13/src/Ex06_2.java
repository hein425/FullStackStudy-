/*
   2. int[][] arr = {
        { 5, 5, 5, 5, 5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
};
arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요
 */
public class Ex06_2 {
    public static void main(String[] args) {
        int arr[][] = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int sum = 0;
        double p = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                sum = sum+arr[i][j];
                p= (double)sum/(arr.length*arr[i].length);

            }
            System.out.println();
        }
        System.out.println("배열의 총합은? => "+sum);
        System.out.println("배열의 평균은? => "+p);
    }
}
