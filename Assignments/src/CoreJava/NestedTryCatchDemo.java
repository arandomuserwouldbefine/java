package CoreJava;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            try {
                int a[] = new int[5];
                a[5] = 30 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception: " + e.getMessage());
            }

            int a[] = new int[5];
            a[5] = 4; // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
    }
}
