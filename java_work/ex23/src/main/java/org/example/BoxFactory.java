package org.example;

public class BoxFactory {

    public static <T> void peekBox(Box<T> box){
        System.out.println(box);
    }

    //와일드카드 <?>: 기능적으로는 그냥 제네릭이랑 동일하다.
    public static void peekBox2(Box<? extends Number> box){ // 상한 제한된 와일드카드
        System.out.println(box);
    }

    public static void peekBox3(Box<? super Integer> box){
        System.out.println(box);
    }

    // 상한제한
    public static void peekBox4(Box<? extends AA> box){
        System.out.println(box);
    }

    // 하한제한
    public static void peekBox5(Box<? super BB> box){
        System.out.println(box);
    }

    public static void peekBox6(Box<? extends AA> box){
        AA getbox = (AA) box.getT();
        System.out.println(box);
//        box.setT(new AA()); 상한제한 걸면 세터 사용불가
    }

    public static void peekBox7(Box<? super AA> box){
//        AA getbox = (AA) box.getT(); 하한제한 걸면 게터 사용불가
        System.out.println(box);
        box.setT(new AA());

    }

    public static void peekBox8(Box<? super AA> box){
        System.out.println(box);
        box.setT(new AA());

    }


    public static <T> T getMyBox(Box<? extends T> box){
        return box.getT();
    }

}

// super integer 하면 하한이 integer 라서 그 위에 number, object 까지 가능해짐