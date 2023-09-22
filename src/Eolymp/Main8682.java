package Eolymp;

import java.util.Scanner;

public class Main8682 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        String res = "";

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            if (Character.getNumericValue(String.valueOf(n).charAt(i)) % 2 == 1 ){
                res += String.valueOf(n).charAt(i);
            }
        }
        if (res != ""){
            System.out.println(res);
        }else System.out.println(0);
    }
}
