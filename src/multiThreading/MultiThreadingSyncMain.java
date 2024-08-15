package multiThreading;

public class MultiThreadingSyncMain {

    public static void main(String[] args) {
        // Syncronization in multi-threading
        BookCatalog bookCatalog = new BookCatalog();
        Thread thread1 = new Thread(() -> {
            bookCatalog.displayBooks();
        });
        Thread thread2 = new Thread(() -> {
            bookCatalog.displayBooks();
        });
        thread1.start();
        thread2.start();
        
        // Without syncronization in multi-threading
        BookCatalog bookCatalog2 = new BookCatalog();
        Thread thread3 = new Thread(() -> {
            bookCatalog2.displayBooksWithoutSync();
        });
        Thread thread4 = new Thread(() -> {
            bookCatalog2.displayBooksWithoutSync();
        });
        thread3.start();
        thread4.start();

        // Accessing shared resource without syncronization
        BookCatalog bookCatalog3 = new BookCatalog();
        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                bookCatalog3.incrementBookCount();
            }
        });
        Thread thread6 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                bookCatalog3.incrementBookCount();
            }
        });
        thread5.start();
        thread6.start();
        try {
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Book count: " + bookCatalog3.bookCount);
    }
}

class BookCatalog {
    public synchronized void displayBooks() {
        for (int i = 1; i <= 5; i++) {
            
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + " Book " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayBooksWithoutSync() {
        for (int i = 6; i <= 10; i++) {
            
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + " Book " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    int bookCount = 0;
    public void incrementBookCount() {
        bookCount++;
    }
}