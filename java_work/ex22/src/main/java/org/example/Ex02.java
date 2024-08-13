package org.example;

public class Ex02 {
    public static void main(String[] args) {
        DBox<String,Integer,String,String,String> box = new DBox();
        // 여기에 기본 자료형은 안대 int 같은거
        box.setA("홍길동");
        box.setB(20);

        System.out.println(box);

        Object obj = "스트링";
        String str = (String)obj;

    }
}
