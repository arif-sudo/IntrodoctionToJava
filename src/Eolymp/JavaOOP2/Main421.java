package Eolymp.JavaOOP2;

import java.util.Scanner;

public class Main421 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l = scan.nextDouble();
        double k = scan.nextDouble();
        int count = 0;

        while (l > 1){
            if (l / k > 1){
                count++;
            }
            l /= k;
        }

        System.out.println(count);
    }
}
