public class Ex07 {
    public static void main(String[] args) {

        //빌더가 속도가 빠르다
        // 천글자 + 천글자  이런거 할땐 느리긴 함
        StringBuilder sb = new StringBuilder();

        sb.append("asdf");
        sb.append("asdf");

        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.replace(0,5,"kkk");
        System.out.println(sb);

        sb.append("asdf");
        sb.reverse();
        System.out.println(sb);
    }
}
