// 쉬프트 f10 실행
// 컨트롤 알트 L 정렬
// 알트 인서트

//알트 1 경로
//알트 인서트 파일생성
// 컨트롤 e 파일 찾기
// 쉬프트 쉬프트 도 파일 찾기

//~~~1+(1+2)+...+(1+2+3...+10) 의 결과를 구하여라~~~
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.println("j=" + j );
                sum = sum + j;
            }System.out.println("=====");
        }
        System.out.println(sum);
    }
}