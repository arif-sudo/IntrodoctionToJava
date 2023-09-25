package Eolymp.JavaOOP2;

import java.util.Scanner;

public class Main910 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0; // To store the sum of positive numbers
        int count = 0; // To count the number of positive numbers

        for (int i = 0; i < n; i++) {
            double num = scan.nextDouble();

            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            // Calculate and print the arithmetic mean with 2 decimal places
            double mean = sum / count;
            System.out.printf("%.2f%n", mean);
        } else {
            // No positive numbers found
            System.out.println("Not Found");
        }
    }
}
