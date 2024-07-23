package org.example;
//저번주 문제 선생님 풀이
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int test[] = {1,2,3};
        int test1[] = {4,5,6,7};
        int temp[][] = {test, test1, {8,9,10,11} };

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int dimesion3[][][] = {arr,temp}; //3차원배열 파이선이나 영상처리 할때 많이씀
                                            // 자바는 별로 안씀


        int temp0[] = arr[0];
        int temp1[] = arr[1];
        int temp2[] = arr[2];


        arr[0] = temp2;
        arr[1] = temp0;
        arr[2] = temp1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        //System.out.println("temp");
        //System.out.println(Arrays.toString(temp0));
    }
}
