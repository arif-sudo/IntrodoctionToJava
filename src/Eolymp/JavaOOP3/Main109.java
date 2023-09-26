package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int totalPages = 0;
        int digitsUsed = 0;

        while (digitsUsed < n) {
            totalPages++;
            digitsUsed += countDigits(totalPages);
        }

        if (digitsUsed == n) {
            System.out.println(totalPages);
        } else {
            System.out.println("0");
        }

        input.close();

    }
    private static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
