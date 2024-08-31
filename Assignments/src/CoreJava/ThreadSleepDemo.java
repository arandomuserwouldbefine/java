package CoreJava;

class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread running. Sleeping for 2000ms.");
            Thread.sleep(2000);
            System.out.println("Thread woke up after 2000ms.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Main class to start the threads
public class ThreadSleepDemo {
    public static void main(String[] args) {
        Thread t1 = new SleepThread();
        Thread t2 = new SleepThread();
        t1.start();
        t2.start();
    }
}
