package Q_8;

import java.util.Scanner;

public class volume{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radiusc (r) of the sphere: ");
        double r = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume of the sphere: " + volume);
        scanner.close();
    }
}

