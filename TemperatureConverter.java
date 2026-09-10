import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Temperature Converter
 * Converts temperatures between Fahrenheit and Celsius based on user choice.
 */
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=====================================");
        System.out.println("      TEMPERATURE CONVERTER");
        System.out.println("=====================================");

        while (keepRunning) {
            int choice = getMenuChoice(scanner);

            switch (choice) {
                case 1: {
                    double fahrenheit = getTemperature(scanner, "Fahrenheit");
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("%.2f F = %.2f C%n", fahrenheit, celsius);
                    break;
                }
                case 2: {
                    double celsius = getTemperature(scanner, "Celsius");
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("%.2f C = %.2f F%n", celsius, fahrenheit);
                    break;
                }
                case 3:
                    keepRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
            System.out.println();
        }

        scanner.close();
    }

    /** Displays the menu and returns a valid integer choice from the user. */
    private static int getMenuChoice(Scanner scanner) {
        System.out.println("Choose conversion direction:");
        System.out.println("  1. Fahrenheit -> Celsius");
        System.out.println("  2. Celsius -> Fahrenheit");
        System.out.println("  3. Exit");
        System.out.print("Enter your choice (1-3): ");

        while (!scanner.hasNextInt()) {
            System.out.print("That's not a number. Enter your choice (1-3): ");
            scanner.next();
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // clear the newline
        return choice;
    }

    /** Prompts for a temperature value and validates numeric input. */
    private static double getTemperature(Scanner scanner, String unit) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter temperature in " + unit + ": ");
            try {
                value = Double.parseDouble(scanner.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value (e.g., 98.6).");
            }
        }
        return value;
    }

    /** Converts Fahrenheit to Celsius: C = (F - 32) * 5/9 */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /** Converts Celsius to Fahrenheit: F = (C * 9/5) + 32 */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
