package org.example;
// object 생략되어있다. 모든클래스가 object 클래스를 직간접적으로 상속한다.
// @Override --> 어노테이션
//클래스나 메소드에 final 선언하면 상속안댐

/*
배열에서 클래스 다형성 문법으로 friend 클래스 배열로 친구관리 프로그램 만들어봄
부모참조변수는 자식인스턴스를 참조할수 있다.


오버라이드
@Override: 는 부모클래스에 잇는 메서드 재정의 할때만 붙임(생략가능)
                    존재하지 안흔 메서드에 오벌아ㅣ드 적으면 에러

 toString 메서드

 final 은 변수에 쓰면 상수, 메서드에 붙으면 오버라이드 불가, 클래스에 붙으면 상속불가

 */
class A{


}

public class Ex05 {

    public static void main(String[] args) {
        A a = new A();
    }
}
