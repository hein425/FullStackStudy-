package org.example;

import java.util.Arrays;
import java.util.List;
// 복습
// List 1,2,3,4,5,6,7,8,9 생성해서 스트림으로 만들어가지고
// 1. 그냥출력
// 2. 홀수, 짝수, sum 총합 출력하기
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream()
                .forEach(s->System.out.println(s));

        int result = list.stream()
                    .mapToInt(value -> value)
                    .sum();

        System.out.println(result);

        result = list.stream()
                .filter( integer -> integer%2==0)
                .reduce(0,(a,b)->a+b);

        System.out.println(" 짝수 result = " + result);


        result = list.stream()
                .filter( integer -> integer%2==1)
                .reduce(0,(a,b)->a+b);

        System.out.println(" 홀수 result = " + result);
// 맵 , 필터 중간연산
// 썸 , 리듀스 최종연산

    }
}