public class Ex01 {
    public static void main(String[] args) {

        String str1 = new String( "happy");//스트링은 클래스기 때문에 이렇게 할수있음
        String str2 = "happy";
        String str3 = "happy";

        System.out.println(str1+" "+str2);
        System.out.println(str1==str2); // 문자열 비교는 .equals str1.equals(str2)

        System.out.println(str2==str3);
    }
}
