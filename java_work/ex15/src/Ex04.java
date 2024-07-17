public class Ex04 {

    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "new String";

//        System.out.println(str1);
//        System.out.println(str1.length());
//        System.out.println();
//
//        System.out.println(str2);
//        System.out.println(str2.length());
//        System.out.println();

        shwString(str1);
        shwString(str2);
        shwString("Funny String");

    }

    public static void shwString(String str){
        System.out.println(str);
        System.out.println(str.length());
        System.out.println();
    }
}
