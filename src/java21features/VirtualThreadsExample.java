package java21features;


public class VirtualThreadsExample {

    public static void main(String[] args) throws InterruptedException {
        
        // Virtual Threads
        // Virtual threads are lightweight threads that are managed by the JVM and are not mapped to the OS threads.

        Runnable task = () -> {
            System.out.println("Running task:  " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task completed:  " + Thread.currentThread());
        };

        Thread thread = Thread.ofVirtual().start(task);
        thread.join();

        taskWithVirtualThreads(10);
    }

    private static void taskWithVirtualThreads(int i) {
        
        Runnable r = () -> {
            System.out.println("Current virtual thread: " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task completed: " + Thread.currentThread());
        };
        
        Thread[] threads = new Thread[i];
        for(int j = 0; j < i; j++) {
            threads[j] = Thread.ofVirtual().start(r);
        }

        for(Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
