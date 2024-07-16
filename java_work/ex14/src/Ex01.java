// 접근수준
// 퍼블릭>프로텍티드> 디폴트>프라이베잇

class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    //행동하는 메서드
    public void greeting(){
        System.out.println(name + "hello");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override //재정의 라는 뜻
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//constructor 로 private 변수를 바꿀수 있다.
//setter 로 private 변수를 바꿀수 있다.
//다른 생성자 선언시 기본생성자 생략 불가.
public class Ex01 {
    public static void main(String[] args) {
// 기본생성자 선언 후에 setter로 변수 name 변경
        Person p1 = new Person();

// name을 바꾸는 다른 생성자로 선언해서 name 변경.
        Person p2 = new Person("박길동");
//      p1.name="asdf"  <= 이렇겐 안된다 private라서.
        p1.setName("홍길동");


        p1.greeting();
        p2.greeting();

        System.out.println(p1);
    }
}
