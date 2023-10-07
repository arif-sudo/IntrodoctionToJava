package Bigint06_10;

import java.util.Scanner;
import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        BigInteger lcmResult = lcmOfRange(n);
        System.out.println(lcmResult);

    }
    private static BigInteger lcmOfRange(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = lcm(result, BigInteger.valueOf(i));
        }
        return result;
    }
    private static BigInteger lcm(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        return a.multiply(b).divide(gcd);
    }
}