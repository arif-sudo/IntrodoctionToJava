package Eolymp.JavaOOP2;

import java.util.Scanner;

public class Main446 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q, r;
        int count = 0;
        for (int i = 1; i < n; i++) {
            q = n / i;
            r = n - (q * i);
            if ( q == r){
                count++;
            }
        }
        System.out.println(count);
    }
}
