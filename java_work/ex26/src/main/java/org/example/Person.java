package org.example;

enum Person { //enum은 퍼블릭 스태틱 파이널 처럼 작동해
    MAN(1,"남자"),WOMAN(2,"여자");

    private int num;
    private  String gender;

    Person(int num, String gender){
        this.num=num;
        this.gender=gender;
   //   System.out.println("이거 호출되나? 스태틱이라 맨위에 나온다");
    }

    @Override
    public String toString() {
        return "Person{" +
                "num=" + num +
                ", gender='" + gender + '\'' +
                '}';
    }
}
