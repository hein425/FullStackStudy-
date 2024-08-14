package org.example;
// 제네릭 문법. 심화 하는중. 자바8에서 많이 바낌 좀 어려움
public class Main {
    public static void main(String[] args) {
        //Box<String> steelBox = new SteelBox<Object>(); 세모괄호 안에 저래 넣으면 안댐
//        Box<String> steelBox = new SteelBox<>();
//        steelBox.setT("test");
//
//        System.out.println(steelBox.getT());

        // 제네릭으로 만든 메서드 를 와일드카드 써서 상속

        BoxFactory.<Integer>peekBox(new Box<>(10));
        BoxFactory.peekBox2(new Box<>(20));
        BoxFactory.peekBox2(new Box<>(20.38d)); // 이건 더블이라 ㄱㄴ
        //BoxFactory.peekBox2(new Box<>("asdfsadf")); - 이러면 안댐. 피크2 넘버로 한정시켜 놨기 때문에

        BoxFactory.peekBox3(new Box<>(13.54));

    }
}

