package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

// 제네릭 문법 - 딱 정해주는거

//
public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();

        Box<String> box3 = new Box();

        Box<Scanner> box4 = new Box<>();
        Box<StringTokenizer> box5 = new Box<>();
        Box<Random> box6 = new Box<>();
        // 이런것도 가능

        box1.setObj(new Apple());
        box2.setObj(new Orange());

        box3.setObj("apple");
        //box3.setObj(new Apple());
        //위에서 박스3에는 스트링만 넣기로 했기 때문에 이거 안댐

        Apple apple = box1.getObj();
        Orange orange = box2.getObj();


    }
}
