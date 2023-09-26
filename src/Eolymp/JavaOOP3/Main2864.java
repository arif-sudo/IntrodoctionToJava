package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main2864 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        for (double x = a; x <= b; x += h) {
            double y = 3 * Math.sin(x);
            System.out.printf("%.3f %.3f%n", x, y);
        }
    }
}
