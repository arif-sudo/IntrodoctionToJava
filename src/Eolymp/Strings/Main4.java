package Eolymp.Strings;

import java.math.BigInteger;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();

        if ( A.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO) == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
