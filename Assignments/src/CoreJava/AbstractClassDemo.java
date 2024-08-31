package CoreJava;

abstract class Parent {
    public abstract void message();
}

class FirstSubclass extends Parent {
    public void message() {
        System.out.println("This is the first subclass");
    }
}

class SecondSubclass extends Parent {
    public void message() {
        System.out.println("This is the second subclass");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {
        // Create objects for each subclass
        Parent first = new FirstSubclass();
        Parent second = new SecondSubclass();

        // Call the message method
        first.message();
        second.message();
    }
}
