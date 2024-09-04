package org.example;

// 스레드 풀 모델
// 스레드 생성과 소멸은 리소스 소모가 많다. 스레드 풀이 있으면 스레드의 재활용을 할수있따.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex04 {
    public static void main(String[] args) {
        Runnable run1 = () ->{
          int n1 = 10;
          int n2 = 20;
            System.out.println(Thread.currentThread().getName()+" "+(n1+n2));
        };

//      ExecutorService exr = Executors.newSingleThreadExecutor();
        ExecutorService exr = Executors.newFixedThreadPool(2); // 스레드 풀 안에 n개를 넣을거다

        exr.submit(run1);
        exr.submit(run1);
        exr.submit(run1);
        exr.submit(run1);  // 현존하는거 중에는 최고의 방법.

        System.out.println("end"+Thread.currentThread().getName());
        exr.shutdown();
    }
}


