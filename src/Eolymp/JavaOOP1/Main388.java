package Eolymp.JavaOOP1;

import java.util.Scanner;

public class Main388 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int change = 0;

        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
            }else n+=1;
            change++;
        }
        System.out.println(change);
    }
}
