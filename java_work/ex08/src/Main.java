//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void doA(){
        int i = 0;
        while (i < 10) {


            int j = 0;
            while ( j <= i) {
                j++;
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

    }
    public static void main(String[] args) {


        /*
         * print 줄바꿈 없이
         * println 줄바꿈
         *
         * */

        doA();
    }
}