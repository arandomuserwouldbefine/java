package CoreJava;

class TestThreadTwice extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running.");
    }
}

// Main class to start the thread twice
public class ThreadDemoTwice {
    public static void main(String[] args) {
        TestThreadTwice t1 = new TestThreadTwice();
        t1.start();
        try {
            t1.start(); // This will throw IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
