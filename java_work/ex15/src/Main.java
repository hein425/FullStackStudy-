import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str = "Hello.java";
        String temp[] = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "Hello.Java";
        temp = str.split("A-Z");

        System.out.println(Arrays.toString(temp));

        str = "인사하네1요 근2심없이 ";
        temp = str.split("\\d");

        System.out.println(Arrays.toString(temp));

        str = "인사하네1요 근2심없이 ";
        temp = str.split("\\D");

        System.out.println(Arrays.toString(temp));

        if(temp[0].equals("exe"))
            return;

    }
}