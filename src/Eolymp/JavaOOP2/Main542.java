package Eolymp.JavaOOP2;

import java.util.Scanner;

public class Main542 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        int f = scan.nextInt();
        int c = scan.nextInt();
        int n = e + f;
        int boughtSoda = 0;
        int emptyBottles = n;

        while (emptyBottles >= c){
            int newBottles = emptyBottles / c;
            boughtSoda += newBottles;
            int remainingEmptyBottles = emptyBottles % c;
            emptyBottles = newBottles + remainingEmptyBottles;
        }
        System.out.println(boughtSoda);
    }
}
