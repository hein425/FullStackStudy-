package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
오늘 배운거: 인터페이스의 상속, 람다 맛보기, 도커로 가상os, try-catch

interface: 몸체가 없는 메소드를 정의할수 이씀 public 안적어도 댐 void doA()
            변수는 public static final 안적어도 댐

            class 만들어서 인터페이스 상속받아야함
            doA() 메소드 재정의 해야함

            default(), static() 추가 가능하다. 이는 메소드 안에 내용이 존재할수 있다.

            default() -> new... 사용해서 객체 생성해야 호출 가능하다.
            static() ->

 람다 규칙: interface 하나의 추상메서드가 존재해야한다.
 () ->{}

 도커 데스크탑: 우효림 쌤한테 다시배워라
              MySQL 서버 설치 하지 않고
              가상OS docker run 명령어를 설치해서
              heidisql 클라이언트로 접속함

              자바언어로 접속할수 있음
              그때 필요한게 try{}catch{} 가 필요함

try{}catch{}: try는 프로그램 강제진행
               예외상황 생기면 예외 발생 지점에서 catch로 ㄱㄱ

 */

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("a : ");
            int a = sc.nextInt();
            System.out.println("b : ");
            int b = sc.nextInt();

            System.out.println("나누기 시작");
            System.out.println(a / b);
            System.out.println("나누기 끝");

            int c[] = new int[3];
            System.out.println(c[4]);

        }catch(ArithmeticException e){

            //System.out.println(e.getMessage());
            e.printStackTrace(); //  ==>> 오류있을때 빨간글씨 뜨는거
            System.out.println("0으로 나눌수 없습니다.");
        }catch (InputMismatchException ie){
            System.out.println("문자 넣으면 안대요");
        }
        catch(Exception p){

            System.out.println("이건 모든 예외 상황");
        }

        System.out.println("정상종료되었습니다.");
        // try는 프로그램 강제진행
          // 예외상황 생기면 예외 발생 지점에서 catch로 ㄱㄱ

    }
}
