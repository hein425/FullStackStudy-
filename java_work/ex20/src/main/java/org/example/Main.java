package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch(Exception e) {
            e.printStackTrace(); // 뭐가 오류인지 알려주는거
           // System.out.println( e.getMessage());
        }
        System.out.println("success");
    }
}
