public class CC {

    public static int add(){
        System.out.println("기본add");
        return 10;
    }

    public static int add(int num){
        System.out.println("num add");
        return 18;
    }

    public static void main(String[] args) {
        //int result = add();
        //System.out.println("result="+add());
        //System.out.println("result="+result);

        System.out.println("result="+add());
        System.out.println("result="+add(5));
    }


}
