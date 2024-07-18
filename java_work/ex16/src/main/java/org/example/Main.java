package org.example;

import org.example.aa.Student;

/*
 어제 문제 스튜던트 클래스 만들기 선생님 풀이
 */
public class Main {


    Main(){
        Student student = new Student("홍길동",90,80,60);
        System.out.println(student);

        System.out.println(student.getAverage());
        System.out.println(student.getTotal());
    }

    public static void main(String[] args) {
        new Main();
    }
}