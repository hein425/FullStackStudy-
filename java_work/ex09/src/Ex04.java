//참조변수의 특성
class BB {
    int num = 10;
}

class CC {
    public void doA(BB b) {
        System.out.println("b.num= " + b.num);
        b.num = 30;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        BB bb = new BB();
        CC cc = new CC();

        cc.doA(bb);
        System.out.println("bb.num= "+bb.num);

        bb=null;
    }
}

// C언어에선 call by reference 라고 부른다.
// 내일은 생성자와 스트링클래스 배움
// 스캐너 쓸때 시스템.in 이런게 생성자임



