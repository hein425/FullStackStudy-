// 클래스변수는 생성자 기반. 초기화 하면 안댐
//

class InstClass{
    static int num = 0;

    InstClass(){
        num++;
        System.out.println(num);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(InstClass.num);
        InstClass in1 = new InstClass();

        new InstClass();
        new InstClass();
        new InstClass();
        new InstClass();

        System.out.println(in1.num);
    }
}
