package Eolymp;

import java.util.Scanner;

public class Main8640 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean odd;
        String res = "";
        while (a < b + 1){
            odd = true;
            for (int i = 0; i < String.valueOf(a).length(); i++) {
                if (Character.getNumericValue(String.valueOf(a).charAt(i)) % 2 != 1 ){
                    odd = false;
                    break;
                }
            }
            if (odd) res = res + a + " ";
            a++;
        }
        System.out.println(res);
    }
}
