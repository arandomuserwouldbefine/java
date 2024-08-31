package CoreJava;

// User-defined exception for age not within range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// User-defined exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class with validation
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters.");
        }
    }
}

// Main class to test Student class
public class StudentDemo {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "JohnDoe", 20, "Computer Science");
            System.out.println("Student created successfully.");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
