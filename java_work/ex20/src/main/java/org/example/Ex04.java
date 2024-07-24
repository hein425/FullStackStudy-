package org.example;

public class Ex04 {

    public static void main(String[] args) {


        try {
            throw new MyException(new ErrorCode("id를입력하세요", "A101", "id는영어로입력하세요"));
        } catch (MyException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
}
