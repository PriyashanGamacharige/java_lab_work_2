package Q_2;

import java.util.Scanner;

public class convert{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter centimeters: ");
        double cm = scanner.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;
        double remainingInches = inches % 12;

        System.out.println("Output: " + feet + " feet " + remainingInches + " inches");

        scanner.close();
    }
}

