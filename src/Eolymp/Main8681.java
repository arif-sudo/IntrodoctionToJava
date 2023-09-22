package Eolymp;

import java.util.Scanner;

public class Main8681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int product = 1;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            if (String.valueOf(n).charAt(i) == '0') continue;
            product *= Character.getNumericValue(String.valueOf(n).charAt(i));
        }
        System.out.println(product);
    }
}
