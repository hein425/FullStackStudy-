package org.example;

public class Ex02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(10,20);
        Point p2 = (Point)p1.clone(); // << 이렇게 클론으로 할수도 있고
        Point p3 = new Point(p1.getXpos(),p1.getYpos());// <<이렇게 게터로 할수도 있다.

        p1.showPoint();
        p2.showPoint();

        p1.setYpos(30);
        p1.setXpos(50);

        p1.showPoint();
        p2.showPoint();

    }
}
