package org.example;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// 싱크로나이즈드를 대신하는 ReentrantLock


public class Ex06 {

    public static List<Integer> list =
            Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 16; i++) {
            list.add(1);
        }

        System.out.println(list);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(()->{
            synchronized(list){
            ListIterator<Integer> itr = list.listIterator();
            while(itr.hasNext())
                itr.set(itr.next()+1);}
        });

        executorService.submit(()->{
            synchronized(list){
                ListIterator<Integer> itr = list.listIterator();
                while(itr.hasNext())
                    itr.set(itr.next()+1);}
        });

        executorService.submit(()->{
            synchronized(list){
                ListIterator<Integer> itr = list.listIterator();
                while(itr.hasNext())
                    itr.set(itr.next()+1);}
        });


        //        executorService.submit( ()->{
//            for (int i = 0; i < 16; i++) {
//                list.set(i, list.get(i) +i);
//            }
//        });
//
//        executorService.submit( ()->{
//            for (int i = 0; i < 16; i++) {
//                list.set(i, list.get(i) +i);
//            }
//        });
//
//        executorService.submit( ()->{
//            for (int i = 0; i < 16; i++) {
//                list.set(i, list.get(i) +i);
//            }
//        });

        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(list);

    }
}
