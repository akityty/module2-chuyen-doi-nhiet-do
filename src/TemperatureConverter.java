import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * (9.0 / 5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. celsius to fahrenheit");
            System.out.println("2. fahrenheit to celsius");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input celsius temperature");
                    double celsius = scanner.nextDouble();
                    double resultFahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("result: "+resultFahrenheit);
                    break;
                case 2:
                    System.out.println("input fahrenheit temperature");
                    double fahrenheit =  scanner.nextDouble();
                    double resultCelsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println("Celsius: "+resultCelsius);
                    break;
            }
        }
    }
}
