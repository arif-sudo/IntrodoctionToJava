package Eolymp.JavaOOP2;

import java.util.Scanner;

public class Main497 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] monthDays = new int[32];

            for (int j = 0; j < n; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                for (int k = a; k <= b; k++) {
                    monthDays[k]++;
                }
            }
            boolean canPass = false;

            for (int j = 1; j <= 31 ; j++) {
                if (monthDays[j] == n){
                    canPass = true;
                    break;
                }
            }
            System.out.println(canPass ? "YES" : "NO");
        }
    }
}
