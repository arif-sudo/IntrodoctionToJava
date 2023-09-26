package Eolymp.JavaOOP3;

import java.util.Scanner;

public class Main75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int m = scan.nextInt();
        int n = 1;
        int currectCoin = a; // 5 // 6
        int totalCoin = a; // 5 // 11
        while (totalCoin != m){
            currectCoin++;
            n++;
            if (totalCoin + currectCoin * 2 == m){
                break;
            }
            totalCoin += currectCoin;
        }
        System.out.println(n);
    }
}
