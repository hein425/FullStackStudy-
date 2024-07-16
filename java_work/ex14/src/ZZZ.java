import aa.AAA;

public class ZZZ extends AAA{

    int zzz = 10;

    ZZZ(){
        System.out.println("여기에서 할거에요");
        System.out.println(zzz);
        System.out.println(aaa); // 다른패키지에 있어서 디폴트,프라이베잇 안댐
    }

    public static void main(String[] args) {
     ZZZ zzz = new ZZZ();
    }
}
