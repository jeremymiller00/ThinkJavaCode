import java.util.Scanner;

/**
 * Demonstrates a common problem using Scanner.
 */
public class ScannerBug {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);

        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine(); // extra newline needed for reading str after int, have to read in the trailing newline character otherwise remaining data will not be read
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }

}
