import java.util.Scanner;


/**
 * Gets data input from user and returns date in the American format.
 */

public class printAmerican {
    
    public static void printAmerican(String month, String day, int date, int year) {
        System.out.printf("Today is %s, %s %d, %d\n", day, month, date, year);

    }

    public static void printEuropean(String month, String day, int date, int year) {
        System.out.printf("Today is %s, %d %s, %d\n", day, date, month, year);

    }


    public static void main(String[] args) {
        // declare variables
        String month;
        String day;
        int date;
        int year;

        // instantiate scanner
        Scanner in = new Scanner(System.in);
        // get data from user
        System.out.println("\nWhat is the month? \n");
        month = in.nextLine();
        System.out.println("\nWhat is the day of the week? \n");
        day = in.nextLine();
        System.out.println("\nWhat is the day of the month (1-31)? \n");
        date = in.nextInt();
        System.out.println("\nWhat is the year? \n");
        year = in.nextInt();

        // call print method
        printAmerican(month, day, date, year);
        printEuropean(month, day, date, year);
    }
}