package CoreJava;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running by extending Thread class.");
    }
}

// Main class to start the thread
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
