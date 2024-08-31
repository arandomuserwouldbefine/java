package CoreJava;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }
}

// Main class to start the thread
public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
