package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LocksExample {

    public static void main(String[] args) throws InterruptedException {

        // Example of ReentrantLock
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        
        System.out.println("Counter: " + counter.getCount());

        Thread.sleep(1000);

        //Example of ReadWriteLock
        SharedValue sharedValue = new SharedValue();

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedValue.increment();
            }
        };

        Runnable task3 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Value: " + sharedValue.getValue());
            }
        };

        Thread thread3 = new Thread(task2);
        Thread thread4 = new Thread(task3);

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();
    }
}

class Counter {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try{
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class SharedValue {
    private int value = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increment() {
        lock.writeLock().lock();
        try {
            value++;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int getValue() {
        lock.readLock().lock();
        try {
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }
}
