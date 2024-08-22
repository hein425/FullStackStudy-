package org.example;
// 자료형의 열거를 돕는 Scale
public class Ex04 {
    public static void main(String[] args) {
        who(Person.MAN);
//        who(Animal.DOG);
        System.out.println(Person.MAN);
}

    public static void who(Person person){
        if(person==Person.MAN){
            System.out.println("남성손님입니다.");
        }else{
            System.out.println("여성손님입니다.");
        }
    }
}
