import domain.Wholesaler;
import repository.WholesalerRepository;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Wholesaler wholesaler = new Wholesaler();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("""
                    1. 발주하기
                    2. 조회하기
                    3. 종료
                    """);
            int input = scan.nextInt();
            if(input ==3 ){
                System.out.println("종료되었습니다. 다음에 또 이용해주세요:)");
                break;
            }

            switch (input) {
                case 1:
                    break;
                case 2:
                    WholesalerRepository wholesalerRepository = new WholesalerRepository();
                    List<Wholesaler> wrlist = wholesalerRepository.selectwholesaler();
                    int i = 0;
                    while (true){
                        if(i == wrlist.size()){
                            break;
                        }
                        System.out.println(wrlist.get(i));
                        i++;
                    }
                    break;
                default:
                    System.out.println("원하는 숫자를 입력해주세요.");
            }
        }

    }
}
