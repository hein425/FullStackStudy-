package org.example;
// 스레드의 동기화 문제

class Counter{
    private int count = 0;

    public void increment(){
        synchronized(this){
            count++;
        }
    }

    public void decrement(){
        synchronized (this){
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}

public class Ex03 {
    public static Counter counter = new Counter();

    public static void main(String[] args) throws InterruptedException{
        Runnable run1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
//                System.out.println(counter.getCount()+" "+i);
//                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Runnable run2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
//                System.out.println(counter.getCount()+" "+i);
//                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Thread th1 = new Thread(run1);
        Thread th2 = new Thread(run2);

        th1.start();
        th2.start();
        th1.join(); // 조인을 하지 않으면 아래 프린트가 메인 스레드이기 때문에 먼저 동작한다. 조인 적으면 위에꺼 스레드 다 하고 밑에걸 돌아가게 된다.
        th2.join();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
//        System.out.println(counter.getCount());
    }
}

// 동일한 메모리 공간에 스레드 두개가 같이 접근하면 순차적으로 작동한다는 보장이 없다
// 스레드1 이 아직 작업을 덜했는데? 스레드2가 접근하면? 이상해질수 있다.
// 그래서 그걸 보장해 주는게 싱크로나이즈드(동기화) 메소드
