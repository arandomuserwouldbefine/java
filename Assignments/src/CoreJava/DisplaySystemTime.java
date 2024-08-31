package CoreJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime {

    public static void main(String[] args) {
        // Get current system time
        LocalDateTime now = LocalDateTime.now();

        // Format the time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // Display the system time
        System.out.println("Current system time: " + dtf.format(now));
    }
}
