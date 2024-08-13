package org.example;

import java.util.Arrays;

//1. Person 클래스에서 comparable을 상속받아 compareTo메서드를 재정의해서
//이름글자의 갯수로 오름차순 내림차순으로 하였는데,
//이 탐색의 기준이 이름(사전편찬순으로) 되도록 수정해보자.
//ㄱ,ㄴ,ㄷ,ㄹ,ㅁ,ㅂ,ㅅ,
public class test1 {
    public static void main(String[] args) {

        Person [] silicagel ={
                new Person("h",30),
                new Person("c",32),
                new Person("g",32),
                new Person("u",30)
        };

        Arrays.sort(silicagel);

        System.out.println(Arrays.toString(silicagel));

    }


}
