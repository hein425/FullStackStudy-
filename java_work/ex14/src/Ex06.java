class Test{
    public static void doA(){
        System.out.println("static doA");
    }
    public void doB(){
        System.out.println("그냥 instance doB");
    }
}

public class Ex06 {

    int num = 0;
    static void Add(int n){
    //    num +=n; 스태틱 안에서 none스태틱에 있는걸 참조할수 없다
    }

    public static void main(String[] args) {
        Test.doA();
    //    Test.doB();
        Test test = new Test();
        test.doB();

    }
}
