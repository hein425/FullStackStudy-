//메서드의 재귀호출
/* 재귀함수: 자기 자신의 함수를 호출하는것.
 5! = 5*4!
 4! = 4*3!
* */


public class Ex04 {

    public static int fact(int num){

        if(num>0){
            return num*fact(num-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
        // String[] strary = ("aa","bb","cc");
        //System.out.println("배열선언함");
        //main(strary);

    }
}
