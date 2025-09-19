import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = now.format(formatter);

        System.out.println("Formatted DateTime: " + formatted);
    }
}
