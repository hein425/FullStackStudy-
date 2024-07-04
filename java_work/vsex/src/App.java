public class App {
    
    
    public static void doA(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 3){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) throws Exception {
        doA();
        
    }

}
