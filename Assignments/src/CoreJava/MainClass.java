package CoreJava;

// Parent class
class Parent {
    public void message() {
        System.out.println("This is a parent class");
    }
}

// Child class
class Child extends Parent {
    public void message() {
        System.out.println("This is a child class");
    }
}

public class MainClass {

    public static void main(String[] args) {
        // Object of parent class
        Parent parent = new Parent();
        parent.message();

        // Object of child class
        Child child = new Child();
        child.message();

        // Calling parent method using child object
        Parent parentRef = new Child();
        parentRef.message();
    }
}
