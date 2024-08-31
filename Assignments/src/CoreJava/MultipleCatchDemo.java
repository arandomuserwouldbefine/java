package CoreJava;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
    }
}
