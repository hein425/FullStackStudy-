class AAA{
    int count = 10;
}
//참조변수의 특성
public class Ex03 {

    public static void main(String[] args) {
        AAA a1 = new AAA();
        AAA b1 = new AAA();  // =a1; 하면 a1이랑 같아짐
        System.out.println("a1.count = "+a1.count);
        System.out.println("b1.count = "+b1.count);

        a1.count = 30;

        System.out.println("a1.count = "+a1.count);
        System.out.println("b1.count = "+b1.count);


        int a = 10;
        int b = a;

        System.out.println("a= "+a);
        System.out.println("b= "+b);

        b= 20; //기본변수

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
