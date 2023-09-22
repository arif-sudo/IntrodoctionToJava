package Eolymp;

import java.util.Scanner;

public class Main1609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        if (n < 0) n = -1 * n;
        int count = 0;
        while (n > 0){
            int r = n % 10;
            if (r == d){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
