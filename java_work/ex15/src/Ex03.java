/*
오버로딩은 메서드 생성자 이름이 같지만 파라매터가 다를때 사용가능하다
 */

public class Ex03 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("950425");
        Person p3 = new Person("950425", "00112233");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.show();
        p2.show();
        p3.show();
    }
}


