class Box{
    String conts;
// 알트+인서트 생성사,투스트링 등등 만들기
 /*
 int형 배열은 0으로 초기화 된다
 String 배열은 null로 초기화 된다.
  */

    public Box(String conts) {
        this.conts = conts;
    }

    public String toString() {
        return "Box{ conts='" + conts + " ' }";
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Box[] boxs = new Box[5];

        boxs[0] = new Box("사과");

        for (int i = 0; i < boxs.length ; i++) {
            System.out.println(boxs[i]);

        }


    }
}
