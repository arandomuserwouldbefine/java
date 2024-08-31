package CoreJava;

public class PrintIntChar {

    // Method with parameters in the order: (int n, char c)
    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    // Method with parameters in the order: (char c, int n)
    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
        // Create an object of the class
        PrintIntChar pic = new PrintIntChar();

        // Call the methods with different parameter orders
        pic.print(5, 'A');  // Calls the method with (int, char)
        pic.print('B', 10); // Calls the method with (char, int)
    }
}
