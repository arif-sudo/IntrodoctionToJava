package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        while (n > 0){
            int sum = sumOfDigits(n);
            n = n - sum;
            count++;
        }
        System.out.println(count);
    }

    public static int sumOfDigits(int k){
        int sum = 0;
        while (k > 0){
            int r = k % 10;
            sum += r;
            k /= 10;
        }
        return sum;
    }
}
