package Eolymp.JavaOOP1;

import java.util.Scanner;

public class Main8243 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        if (n < 0) n *= -1;
        int first = Character.getNumericValue(String.valueOf(n).charAt(0));

        System.out.println(first);
    }
}
