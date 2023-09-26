package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = countTrailingZeros(n);
        System.out.println(count);
    }

    private static int countTrailingZeros(int n) {
        int count = 0;
        // Divide n by increasing powers of 5 and add the result to count
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
