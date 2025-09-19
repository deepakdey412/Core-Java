import java.util.Date;

public class OldDateExample {
    public static void main(String[] args) {
        Date date = new Date();

        // current date & time
        System.out.println("Current date and time: " + date);

        // get time in milliseconds
        System.out.println("Milliseconds since 1970: " + date.getTime());
    }
}
