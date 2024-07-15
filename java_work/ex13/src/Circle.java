/*
정보은닉을 위한 private 선언
 */
class Circle {

    private int rad;
    private String name;

    // 기본생성자는 생략가능.
    // 다른 생성자 선언시 기본생성자 생략불가...


    public Circle(int rad) {
        this.rad = rad;
    }

    public String getName() {
        return name;
    }


    // 알트 인서트로 겟 셋 소환가능, 컨스트럭터도 소환가능
    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;
        }
        this.name = name;
    }

    //   이 함수를 통해서만 반지름을 넣어라.
//   private 변수는 setter, getter 로 참조가 가능하다.
    public void setRad(int r) {
        if (r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public int getRad() {
        return rad;
    }


    public double getArea() {
        return 3.14 * rad * rad;
    }
}
