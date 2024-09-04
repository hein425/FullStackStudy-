package org.example;

class Task extends Thread{
    @Override
    public void run(){
        try{
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                if (i%2 ==0)
                  System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Task task1 = new Task();
        task1.start();

        Task task2 = new Task();
        task2.start();

    }
}
// 스레드란 하나의 실행흐름

// 스레드 생성법
// 러너블 인터페이스 생성해서
// Thread th1 = new Thread(Runnable)
// th1 =
//
// 스레드 클래스 상속받아서
// 태스크 클래스에서
// 태스크.스타트();