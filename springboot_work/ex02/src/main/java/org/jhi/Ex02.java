package org.jhi;
// 싱글톤 패턴
import org.jhi.components.CC;

public class Ex02 {
    // 자바 프레임워크(개발방법론)
    // 스프링 프레임워크
    public static void main(String[] args) {

        // 이걸로 객체 생성해라
        CC cc1 = CC.getInstance();
        System.out.println(cc1);

        CC cc2 = CC.getInstance();
        System.out.println(cc2);

        CC cc3 = new CC();

        System.out.println(cc1==cc2);
        System.out.println(cc1==cc3);


    }
}
