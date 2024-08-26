package org.example;

import java.util.Random;

//반환값 1개 매개변수가 3개 이거를 반복해야댐
interface AA{
    int doA(int a, int b, int c);
}
interface AAString{
    int doA(String a, String b, String c);
}




@FunctionalInterface
interface RAN{ // 인터페이스 안에 함수 여러개 선언하려면 디폴트 써라 펑셔널은 하나만 됌
    int ran();
    default int doA(){ return 10;}
}

public class Ex02 {
    public static void main(String[] args) {
        RAN ran = () -> new Random().nextInt(50);
        for (int i = 0; i < 10; i++) {
            System.out.println(ran.ran());
        }


        //원래하던거
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(50));
        }
    }
}
