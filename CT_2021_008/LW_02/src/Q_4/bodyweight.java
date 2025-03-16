package Q_4;

import java.util.Scanner;

public class bodyweight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter body weight in pounds: ");
        double bodyWeight = scanner.nextDouble();
        double calories = bodyWeight * 19;
        System.out.printf("Daily calorie requirement: %.2f calories%n", calories);
        scanner.close();
    }
}
