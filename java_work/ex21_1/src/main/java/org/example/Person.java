package org.example;

// 컴페어와 컴페어 투에 대해 배움... 근데 몰루...

// 소팅 작업 할때 comparable compareTo 를 사용한다 (오더 바이랑 비슷한거임)
// person 클래스를 배열로 가져오게 되면

public class Person implements Comparable{ // 인터페이스 상속받으면 인터페이스 안의 메서드를 재정의 해줘야함
                                //제네릭 문법 없어도 되는 이유? => 구버전에선 그딴거 없었기때문
                                // 컴페러블 있으면 컴페어투 재정의
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
//        System.out.println("this = "+this);
//        System.out.println("this age = "+this.age);
//        System.out.println("Person(o) = "+(Person)o);
//        System.out.println(((Person)o).age);


//        if(this.age < ((Person)o).age){
//            return -10;
//        }else if(this.age < ((Person) o).age){
//            return 10;    // 마이너스 위치 바꾸면 배열순서 바낌. 숫자도 바까도 상관 없음
//        }else{
//            return 0;
//        }
//     위에거를 아래처럼 표현해버릴수 있음.

        //return this.age - ((Person)o).age;
        return this.age - ((Person)o).age;
    }
}