// Derrick-Oduro 10974001
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Using a Scanner object for the user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Validate user choice input
        int choice = 0;
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid option. Please choose 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); // Clear invalid input
            }
        }

        // Prompt for temperature input
        double temperature = 0.0;
        while (true) {
            System.out.print("Enter the temperature: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric temperature.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform conversion
        double convertedTemperature = 0.0;
        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, convertedTemperature);
        } else {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, convertedTemperature);
        }

        System.out.println("Thank you for using the Temperature Converter!");
        scanner.close();
    }
}
