package org.example;

import java.util.Random;
import java.util.StringTokenizer;

public class Ex02 {
    public static void main(String[] args) {
        //랜덤
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1000));
        }

        //토크나이저
        StringTokenizer st1 = new StringTokenizer("PM:08:45",":");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
