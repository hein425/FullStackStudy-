class TV{

    public TV(String a, int b, int c) {
        System.out.println(a+"에서 만든 "+b+"년 "+c+"인치");
    }

    public void show() {}
}

public class Ex08_2 {

    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치

        myTV.show();

    }
}
