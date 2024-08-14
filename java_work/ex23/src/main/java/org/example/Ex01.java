package org.example;

public class Ex01 {
    public static void main(String[] args) {

        BoxFactory.peekBox4(new Box<AA>(new AA()));
        BoxFactory.peekBox4(new Box<BB>(new BB()));
        BoxFactory.peekBox4(new Box<CC>(new CC()));
//      BoxFactory.peekBox4(new Box<Object>(new Object())); 이거는 안댐 상한제한에 걸려서

        BoxFactory.peekBox5(new Box<Object>(new Object()));
        BoxFactory.peekBox5(new Box<AA>(new AA()));
        BoxFactory.peekBox5(new Box<BB>(new BB()));
//      BoxFactory.peekBox5(new Box<CC>(new CC())); 이거는 안댐 하한제한에 걸려서

    }
}
