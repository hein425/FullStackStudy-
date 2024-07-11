/*
과자 사는 문제 선생님 답안
 */
public class Ex01 {
    public static void main(String[] args) {
        int total = 5000;
        System.out.println("dvd 하나 빌리면 3500원");
        total = 3500;

        int cri = 500;
        int sa = 700;
        int coke = 400;

        total = total - (cri+sa+coke);
        System.out.println(total);

        for(int i =0; i<4; i++){
            for(int j =0; j<3;j++){
                for(int k =0; k<4 ; k++){
                    System.out.println("i="+i+"j="+j+"k="+k);
                    System.out.println("크림팡은"+(1+i)+"개");
                    System.out.println("새우깡은"+(1+j)+"개");
                    System.out.println("콜라는"+(1+k)+"개");

                }
            }
        }
        /*
         영화관 키오스크 만든애들이 팝콘 몇개 콜라몇개 이런거 만들때 쓴 로직.
         개나이스
         */

    }
}
