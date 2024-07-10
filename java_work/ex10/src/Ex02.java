class B{
    //생성자도 toString 처럼 생략가능하지만 적으면  내용 실행
    int a = 10;
    public B(){
        System.out.println("생성자");
        a=20;
    }

}

public class Ex02 {
    public static void main(String[] args) {
    //생성자는 함수랑 비슷한 모양이지만 반환값을 적지 않는다.
    B b = new B();
        System.out.println(b.a);
    }
}
