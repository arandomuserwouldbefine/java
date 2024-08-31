package CoreJava;

public class IncreasingNumberTriangle {

    public static void main(String[] args) {
        int num = 1;

        // Display the pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
