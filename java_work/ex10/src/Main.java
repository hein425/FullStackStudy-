/*
초 입력받아 시분초 나타내기
 */
import aa.CalSecond;
public class Main {
    public static void main(String[] args) {

        CalSecond calSecond = new CalSecond();

        int retValue = calSecond.inputNumber();
        System.out.println(retValue);

        String resultValue = calSecond.calculate(retValue);
        System.out.println(resultValue);

//        CalSecond calSecond2 = new CalSecond();
//        .toString 은 생략되어진 문법
//        System.out.println(calSecond.toString());
//        System.out.println(calSecond2);

    }
}