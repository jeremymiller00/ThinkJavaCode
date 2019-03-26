import java.util.Scanner;

/**
 * Converts celcius temperature to farenheit temperature
 */
public class celciusToFarenheit {

    public static void main(String[] args) {
        double celcius;
        final double slopeNumerator = 9.0;
        final double slopeDenominator = 5.0;
        final double intercept = 32.0;
        double farenheit;

        Scanner in = new Scanner(System.in);

        // prompt the user for a value
        System.out.println("What is the temperature in Celcius? ");
        celcius = in.nextDouble();

        // perform conversion
        farenheit = celcius * slopeNumerator / slopeDenominator + intercept;
        System.out.printf("%.2f degrees celcius = %.2f degrees farenheit.\n", celcius, farenheit);
    }
}