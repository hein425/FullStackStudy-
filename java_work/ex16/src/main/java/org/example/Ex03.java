package org.example;
import org.example.aa.BizMan;
//상속은 재활용 가능한 코드
//연관된 일련의 클래스들에 대해 공통적인 규약을 정의할수 있다.
public class Ex03 {
    public static void main(String[] args) {
        BizMan bm = new BizMan("홍길동","그린컴퓨터","선생님");
        bm.showInfo();
    }
}
