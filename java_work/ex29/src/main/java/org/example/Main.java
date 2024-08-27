package org.example;
// 스트림의 이해와 스트림의 생성


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1~10 까지 중에 홀수만 더하기 원래알던방법
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1)
                sum += arr[i];
        }
        System.out.println(sum);

        //스트림 써서 하기
        sum = Arrays.stream(arr)
                .filter(n->n%2==1) // predicate(걍 람다)
                .sum();
        System.out.println(sum);

    }
}