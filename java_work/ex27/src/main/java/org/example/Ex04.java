package org.example;

// 람 다

interface AA{
    void doA();

    default void doB(){
        System.out.println("doB");
    }

    static void doC(){
        System.out.println("doC");
    }
}

public class Ex04 {

    public static void doMethod(AA aa){
        aa.doA();
        aa.doB();
        AA.doC();
    }

    public static void main(String[] args) {
        AA aa = () ->{
            System.out.println("doA 메서드 재정의");
        };

        aa.doA();

        doMethod( ()->{ System.out.println("새로운 함수 정의"); } );

 //     doMethod( ()-> System.out.println("새로운 함수 정의") );
        //{}왕괄호는 한줄일때 지우면 됌
        //그럼 세미콜론도 지워야댐
    }
}
