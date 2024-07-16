package aa;
// static => 프로그램 시작하면 메모리에 바로 적재댐
// 너무 많이 쓰면 메모리가 부족해짐
public class Circle {

    public static final double PI = 3.1415;
    public static int a = 10;

    public void doD(){
        System.out.println(2*PI*a);
    }

    public void doN(){
        System.out.println(a*a*PI);
    }



    public int doA(){
        int sum = 0;
        int aa = 10;
        int bb = 20;

        for (int i = 0; i < 10; i++) {
            sum =+i;
        }
        return sum;
    }
}


