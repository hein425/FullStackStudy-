package org.example;
import org.example.aa.Box;
//롬복 쓰는거 해봣는데 잘 안된다
public class Ex01 {

    Ex01() {
        Box box = new Box("myBox");
        System.out.println(box);

        System.out.printf("%s\n","문자열 출력");

        int a = 10;
        int b = 20;

        System.out.printf("%d\n",a);
        System.out.printf("%f\n",(double)a);
        System.out.printf("%o\n",a);

        System.out.println(String.format("%d + %d = %d",a,b,a+b));
    }

    public static void main(String[] args) {
        new Ex01();
    }
}
