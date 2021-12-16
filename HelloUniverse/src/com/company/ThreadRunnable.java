package com.company;
class MyThreatRunnable1 implements Runnable{
    @Override
    public void run() {
        while(true){System.out.println("this is thread 1 ");}
    }

}
class MyThreatRunnable2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("this is thread 2 ");
        }
    }

}

public class ThreadRunnable {
    public static void main(String[] args) {
        MyThreatRunnable1  bullet1 = new MyThreatRunnable1();
       Thread gun1 = new Thread(bullet1);
        MyThreatRunnable2 bullet2 = new MyThreatRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
