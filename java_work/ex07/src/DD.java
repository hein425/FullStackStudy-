import java.util.Scanner;

public class DD {

    //1+2~10 까지 더하는 메소드
    public static void doA(int end){
        int suma = 0;
        for(int i =1; i<= end ; i++){
            suma=suma+i;
        }
        System.out.println("1부터"+ end +"까지 더한 수"+suma);
    }

    //1*2*3*4*5*6*7*8*9*10 곱하는 메소드
    public static void doB(int end){
        int sumb =1;
        for(int j=1;j<=end;j++){
            sumb=sumb*j;
        }
        System.out.println("1부터"+ end +"까지 곱한 수"+sumb);
    }


    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("몇까지 더할가요?");
        int test = sc.nextInt();
        doA(test);

        System.out.println("몇까지 곱할까요?");
        int vvs = sc.nextInt();
        doB(vvs);


    }
}
