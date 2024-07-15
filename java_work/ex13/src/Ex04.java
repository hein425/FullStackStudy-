public class Ex04 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

//        circle1.rad = -10;
//        ㄴ이렇게 반지름에 음수를 넣는짓을 못하게 막는법!!
//        circle2.rad = 20;
        circle1.setRad(-10);

        System.out.println(circle1.getRad());
    }
}
