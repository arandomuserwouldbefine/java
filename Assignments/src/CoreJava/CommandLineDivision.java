package CoreJava;

public class CommandLineDivision {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Please provide two numbers as command line arguments.");
                return;
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = num1 / num2;
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter valid integers.");
        }
    }
}
