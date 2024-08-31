package CoreJava;

class TestDaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("Daemon thread running.");
    }
}

// Main class to demonstrate daemon thread
public class DaemonThreadDemo {
    public static void main(String[] args) {
        TestDaemonThread t1 = new TestDaemonThread();
        TestDaemonThread t2 = new TestDaemonThread();
        
        t1.setDaemon(true); // Setting daemon flag
        t1.start(); // This will throw IllegalThreadStateException
        t2.start();
        
        System.out.println("Is t1 daemon? " + t1.isDaemon());
    }
}
