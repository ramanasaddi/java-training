package com.java.training.threads;

public class TestThread {
    public static void main(String[] args) {
        MyThreadDemo thread1 = new MyThreadDemo("Facebook");
        thread1.start();
        MyThreadDemo thread2 = new MyThreadDemo("Google");
        thread2.start();
        MyThreadDemo thread3 = new MyThreadDemo("Spaces");
        thread3.start();
    }
}
    class MyThreadDemo extends Thread {
        public MyThreadDemo(String threadName) {
            super(threadName);
        }

        public void run(){
            for (int counter=1; counter <= 5; counter++) {
                System.out.println("Loop " + counter + ":" + getName() + ", ID: " + getId() + ", State: "+ getState());
            }

            try{
                sleep((int) (Math.random() * 2000));
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

