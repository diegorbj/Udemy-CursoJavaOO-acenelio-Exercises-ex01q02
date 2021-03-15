package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(radius, 2);

        System.out.printf("AREA = %.4f%n", area);

        sc.close();
    }
}
