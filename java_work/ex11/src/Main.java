import java.util.Scanner;

class Fact {
    public int fact(int num) {
        // 메서드는 반환값을 적게되면 반환값이 무조건 있어야 한다.
        System.out.println("여기오나"+num);

        if(num>0){
           return 2*fact(num-1);

            // 2*fact(2)
            // 2*2*fact(1)
            // 2*2*2*fact(0)
            // =2*2*2*1
        }else{
            return 1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        /*
        Sting -> int   Integer.parseInt
        int -> String  10+""
        문자열입력 scan.nextLine
        숫자입력 scan.nextInt
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("2의 몇승 구할래?");

//        int num = sc.nextInt();

        String a = sc.nextLine();
        int num = Integer.parseInt(a);
//          ㄴ 글을 숫자로 바꾸기
        //클래스의 정의와 인스턴스화

        Fact fact = new Fact();
        int result = fact.fact(num);

        System.out.println("result= "+result);
    }
}
