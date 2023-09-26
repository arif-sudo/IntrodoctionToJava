package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main906 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int product = 1;
        while (n > 0){
            int r = n % 10;
            product *= r;
            n /= 10;
        }
        System.out.println(product);
    }
}
