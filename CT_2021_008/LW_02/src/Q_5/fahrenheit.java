package Q_5;

import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", fahrenheit, celsius);
        scanner.close();
    }
}