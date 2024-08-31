package CoreJava;

public class NumberTriangle {

    public static void main(String[] args) {
        // Display the pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
