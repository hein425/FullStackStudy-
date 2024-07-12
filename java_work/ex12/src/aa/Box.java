package aa;
//클래스 정의
public class Box {
    String name;
    int count;
    /*
    기본생성자는 생략가능
    다른 생성자 선언할시 생략 불가
    */
    public Box() {
        System.out.println("기본생성자 호출");
    }
    public Box(String n) {
        name = n;
        System.out.println("다른생성자 호출");
    }
    public Box(String n, int c) {
        name = n;
        count = c;
        System.out.println("n c 다른생성자 호출");
    }
    //생략된거지만
    //개발자가 직접 적게되면 내용이 바뀌는것이다.
    // 원래 toString 은 주소값 출력임 근데 우리가 바꿈
    public String toString() {
        return " Box name = " + name +" "+" count = " + count ;
    }
    public void doA() {
    }
    public void doA(String a) {
    }
}
