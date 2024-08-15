package multiThreading;

public class ThreadWaitNotifyExample {

    public static void main(String[] args) {
        Object lock = new Object();
        int[] numbers = {1, 2, 3, 4, 5};
        char[] alphabates = {'A', 'B', 'C', 'D', 'E'};

        Thread numberPrinter = new Thread(new NumberPrinter(lock, numbers));
        Thread printAlphabets = new Thread(new PrintAlphabets(lock, alphabates));

        numberPrinter.start();
        printAlphabets.start();
    }
}

class NumberPrinter implements Runnable {

    private final Object lock;
    private final int[] numbers;

    public NumberPrinter(Object lock, int[] numbers) {
        this.lock = lock;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " " + numbers[i]);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notify();
        }
    }
}

class PrintAlphabets implements Runnable {

    private final Object lock;
    private final char[] alphabates;

    public PrintAlphabets(Object lock, char[] alphabates) {
        this.lock = lock;
        this.alphabates = alphabates;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < alphabates.length; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " " + alphabates[i]);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notify();
        }
    }
}
