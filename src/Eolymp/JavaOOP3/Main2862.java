package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main2862 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1 ){ // odd divisors
                System.out.println(i);
            }
        }
    }
}
