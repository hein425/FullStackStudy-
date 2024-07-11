import aa.A;
//import bb.A;

public class Ex02 {
    public static void main(String[] args) {

        A a = new A(); // 다른 경로라서 import 필요
        a.aa();

        bb.A aa=new bb.A(33);
        aa.bb();
       // Ex01 ex01= new Ex01(); //같은 경로라서 그냥 가능
    }
}
