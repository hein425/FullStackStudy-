class A{
    int num = 11;
    public void doA(){
        System.out.println("아무렇게 만들기");
    }
}
/*
ㄴ 클래스 정의 원래는 파일 나누는게 국룰
 */
public class Ex01 {

    public static void main(String[] args) {

        int num = 10;//여러개 선언 가능
        int num2 = 20;
        int num3 = 30;

        // 선언하는 순간 메모리에 적재된다.
        // 메모리 안에 클래스를 적재할때 new를 쓴다
        //
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        System.out.println(a1.num);
        a1.doA();
        a1.num = 30;
        System.out.println("a1.num= "+a1.num);


        System.out.println("a2.num= "+a2.num);
        a2.doA();
    }
}
