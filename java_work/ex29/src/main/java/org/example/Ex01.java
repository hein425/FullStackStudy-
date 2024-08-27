package org.example;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] arr = {"YOON","PARK","ROBOT"};

        for (String temp : arr){
            System.out.println("내용 "+temp);
        }

        /*
        *   스트림 생성방법
        *   중간연산 필터,맵
        *   최종연산 썸 포이치
        *
        */

        Arrays.stream(arr)
                .forEach(s-> System.out.println("내용 "+s));
                // 중간연산은 달아도 되는데 최종연산 후에 포이치

    }
}
