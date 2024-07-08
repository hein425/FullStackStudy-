import javax.swing.*;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();


        System.out.println("a 참조변수는 "+a);
        //= System.out.println(a. toString);
        System.out.println("b 참조변수는 "+b);
        // 참조 변수 출력할때 toString 생략가능.
        // toString 은 내가 다시 정의할수있따.
        // 재정의 하기 전 원래는 주소값

        a.mod();
        System.out.println();

        System.out.println("a 참조변수는 "+a);
        System.out.println("b 참조변수는 "+b);


    }
}
