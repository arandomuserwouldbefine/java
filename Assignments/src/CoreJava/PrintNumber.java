package CoreJava;

public class PrintNumber {

    public void printn(int number) {
        System.out.println("Integer: " + number);
    }

    public void printn(double number) {
        System.out.println("Double: " + number);
    }

    public void printn(float number) {
        System.out.println("Float: " + number);
    }

    public void printn(long number) {
        System.out.println("Long: " + number);
    }

    public void printn(byte number) {
        System.out.println("Byte: " + number);
    }

    public void printn(short number) {
        System.out.println("Short: " + number);
    }

    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();

        // Different data types
        pn.printn(5);
        pn.printn(5.5);
        pn.printn(5.5f);
        pn.printn(5555555555L);
        pn.printn((byte) 5);
        pn.printn((short) 5);
    }
}
