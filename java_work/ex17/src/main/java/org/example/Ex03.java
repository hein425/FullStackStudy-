package org.example;
import org.example.phone.*;

//부모클래스에 있는 메소드는 상속되며
//자식클래스에 동이랗ㄴ 이름의 메소드가 있으며
//오버라이딩(재정의) 된다.
public class Ex03 {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new SmartPhone("6.0", 123456);
        mobilePhone.show();


    }
}
