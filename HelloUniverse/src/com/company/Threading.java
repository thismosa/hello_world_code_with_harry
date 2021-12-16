package com.company;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("my thread coking is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("my thread programming  is running");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread1  t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
