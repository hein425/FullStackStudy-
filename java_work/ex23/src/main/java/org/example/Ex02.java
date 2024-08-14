package org.example;

public class Ex02 {
    public static void main(String[] args) {

        BoxFactory.peekBox6(new Box<>(new AA()));
        BoxFactory.peekBox7(new Box<>(new AA()));

        BB bb = BoxFactory.<BB>getMyBox(new Box<>(new BB()));
        AA aa = BoxFactory.<AA>getMyBox(new Box<>(new BB()));

//        BB bb = BoxFactory.<BB>getMyBox(new Box<>(new BB()));
//        AA aa = BoxFactory.<AA>getMyBox(new Box<>(new BB()));
        //제한된 와일드카드 선언을 갖는 제네릭메소드:도입  메소드 오버로딩이 불가능할때(이름은 같은데 내용 다를때)...


    }

}
