package Eolymp;

import java.util.Scanner;

public class Main2607 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (i % 2 == 0 ){
                oddSum+= Character.getNumericValue(String.valueOf(num).charAt(i));
            }else evenSum+= Character.getNumericValue(String.valueOf(num).charAt(i));
        }
        System.out.println(oddSum * evenSum);
    }

}
