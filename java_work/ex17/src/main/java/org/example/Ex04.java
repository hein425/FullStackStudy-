package org.example;

import org.example.box.Box;
import org.example.box.GoldBox;
import org.example.box.PaperBox;
/*
상속관계에서는 다형성(부모클래스는 자식클래스를 참조할수 있는 규칙)
메소드 오버라이딩 기법
instanceof 연산자로 클래스 비교 7/19
 */
public class Ex04 {
    public static void main(String[] args) {

        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldBox box3 = new GoldBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

    public static void wrapBox(Box box){
        if(box instanceof GoldBox){
            ((GoldBox) box).goldbox();
        }else if(box instanceof PaperBox){
            ((PaperBox) box).paperbox();
        }else{
            box.box();
        }

    }
}
