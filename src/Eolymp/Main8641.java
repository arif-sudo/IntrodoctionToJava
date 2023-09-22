package Eolymp;

import java.util.Scanner;

public class Main8641 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum;
        String res = "";
        while (a < b + 1){
            sum = 0;
            for (int i = 0; i < String.valueOf(a).length(); i++) {
                sum += Math.pow(Character.getNumericValue(String.valueOf(a).charAt(i)), 3);
            }
            if (a == sum) res = res + a + " ";
            a++;
        }
        System.out.println(res);
    }
}
