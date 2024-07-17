// 스트링 클래스의 메소드
public class Ex06 {
    public static void main(String[] args) {
        String a= "asd";
        String b= "bsd";

        System.out.println(a+b);// 이렇게 더할수도 있꼬
        System.out.println(a.concat(b)); //콩캇 이용해서 더할수도 있다
        // 콩캇을 이용하면 메모리를 아낄수 있다

        System.out.println(a.compareTo("asd"));
        System.out.println(a.compareTo("ASD"));
        System.out.println(a.compareTo("qweqwe"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASD"));
        System.out.println(a.compareToIgnoreCase("Asd")); //사전편찬순으로 비교

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASD"));
        System.out.println(a.compareToIgnoreCase("ASDad"));
        System.out.println(a.compareToIgnoreCase("qweqweqwe"));

        System.out.println();
    }
}
// 스트링 빌더와 버퍼는 기능적으로 동일
// 버퍼는 스레드에 안전