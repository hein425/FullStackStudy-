package org.example;
// 스레드: 메인에서 실행 흐름을 하나 더 만드는거
// 이런게 모여서 프로세스

// 자바는 싱글스레드로 이뤄져 있지만 다중 스레드를 구현할 수 있다.
public class Main {
    public static void main(String[] args) {
        //메인, 스레드-0 , 스레드-1 세개의 흐름을 만들어봄. 이게 모여서 하나의 프로세스
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println( Thread.currentThread().getName()+" "+i);
            }
        };

        for (int i = 0; i < 1000; i++) {
            Thread th1 = Thread.currentThread();
            System.out.println(th1.getName()+" "+i);
        }
// ---------------------------------------------- 여기까지는 동기화. 아래부터 비동기

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

    }
}