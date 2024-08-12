package org.example;

public class Ex01 {
    public static void main(String[] args) {

        //primitive 기본형이기 때문에 함수가 없다
        int a = 10;
        //wrapper 클래스 이기 때문에 함수가 존재한다
        Integer b = Integer.valueOf(20);

        System.out.println(a);
        System.out.println(b);

        // 언박싱. 래퍼 클래스가 기본자료형 타입으로 자동 변환된다.
        a = b;

    }
}
