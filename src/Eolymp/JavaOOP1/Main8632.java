package Eolymp.JavaOOP1;

import java.util.Scanner;

public class Main8632 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            getOdds(String.valueOf(n).charAt(i));
        }
        System.out.println(count);
    }

    public static void getOdds(Character c) {
        if (c % 2 == 1){
            count++;
        }
    }
}
