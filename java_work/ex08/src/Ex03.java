// ~변수의 스코프~
// 변수의 가시성에 대해 배웟다
//동일한곳(클래스,) 안에서 같은 변수,메소드 선언 안댐

public class Ex03 {

    public static void doA(int a) {
        System.out.println("a= " + a);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num1 == 10) {
            num2 = 20;
        }

        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);

        for (int i = 0; i < 3; i++) {
            int a = 20;
            System.out.println(a);
        }
    }


}
