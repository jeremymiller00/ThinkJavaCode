import java.util.Scanner;

/**
 * Converts and input number of seconds to Hours, Minutes, Seconds output
 */

public class secondsConverter {

    public static void main(String[] args) {
        int seconds;
        int minutes;
        int hours;
        int remainingSeconds;
        int remainingMinutes;

        Scanner in = new Scanner(System.in);

        System.out.println("How many seconds? ");
        seconds = in.nextInt();
        minutes = seconds / 60;
        remainingSeconds = seconds % 60;
        hours = minutes / 60;
        remainingMinutes = minutes % 60;

        System.out.printf("%d Hours, %d Minutes, %d Seconds\n", hours, remainingMinutes, remainingSeconds);
    }
}