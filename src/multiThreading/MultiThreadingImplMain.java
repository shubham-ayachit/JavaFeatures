package multiThreading;

import java.util.Scanner;

public class MultiThreadingImplMain {

    public static void main(String[] args) throws InterruptedException {
        
        // Creating object of MyMultiThreading class by extending Thread class
        MyMultiThreading myMultiThreading = new MyMultiThreading();
        myMultiThreading.start();

        // Creating object of MyMultiThreading2 class by implementing Runnable interface
        MyMultiThreading2 myMultiThreading2 = new MyMultiThreading2();
        Thread thread = new Thread(myMultiThreading2);
        thread.start();

        // Creating thread using lambda expression
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread is running...");
        });
        thread2.start();

        //Thread lifecycle
        Thread thread3 = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        // Thread state: NEW
        System.out.println("Thread state: " + thread3.getState());
        thread3.start();
        // Thread state: RUNNABLE
        System.out.println("Thread state: " + thread3.getState());
        // Thread is alive: true
        System.out.println("Thread is alive: " + thread3.isAlive());
        // Thread state: TIMED_WAITING
        System.out.println("Thread state: " + thread3.getState());
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Thread state: TERMINATED
        System.out.println("Thread state: " + thread3.getState());

        Thread.sleep(2000);

        MyExample myExample = new MyExample();
        Thread thread4 = new Thread(() -> {
            myExample.displayNumber();
        });
        Thread thread5 = new Thread(() -> {
            myExample.displayNumber();
        });

        thread4.start();
        thread5.start();
    }
}

class MyMultiThreading extends Thread {

    @Override
    public void run() {
        System.out.println("MyMultiThreading: Thread is running...");
    }
}

class MyMultiThreading2 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyMultiThreading2: Thread is running...");
    }
}

class MyExample {
    public synchronized void displayNumber() {
        char[] alphabates = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 1; i <= 5; i++) {
            
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.currentThread().notify();
                Thread.currentThread().wait();
                System.out.println(Thread.currentThread().getName() + " " + alphabates[i - 1]);
                Thread.currentThread().notify();
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void displayAlphabate() {
        char[] alphabates = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + alphabates[i - 1]);
                Thread.currentThread().notifyAll();
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
