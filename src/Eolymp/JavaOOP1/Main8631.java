package Eolymp.JavaOOP1;

import java.util.Scanner;

public class Main8631 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int count = 0;
        int M = Character.getNumericValue(String.valueOf(n).charAt(0));
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            if (Character.getNumericValue(String.valueOf(n).charAt(i)) > M){
                M = Character.getNumericValue(String.valueOf(n).charAt(i));
            }
        }

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            if (Character.getNumericValue(String.valueOf(n).charAt(i)) == M){
                count++;
            }
        }
        System.out.println(count);
    }
}
