public class Ex05 {
    public static void main(String[] args) {

        Box a = new Box();
        Box b = new Box();

        System.out.println(a);
        System.out.println(b);

        a.setName("apple");
        System.out.println(a);
        System.out.println(b);

        b.setName("watermelon");
        System.out.println(a);
        System.out.println(b);

    }
}
