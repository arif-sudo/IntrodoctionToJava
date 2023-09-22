package Eolymp.JavaOOP2;

import java.util.Scanner;

public class Main419 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
//            if (a < 0) a *= -1;
//            if (b < 0) b; 
            int cycle, Mcycle = 0 ,num, increment = a;

            while ( increment < b + 1){
                num = increment;

                cycle = 1;
                while (num != 1) {
                    if (num % 2 == 1){
                        num = 3 * num + 1;
                    }else num /= 2;
                    cycle++;
                }
                if (cycle > Mcycle){
                    Mcycle = cycle;
                }
                increment++;
            }
            System.out.println(a + " " + b + " " + Mcycle);
        }
        scan.close();
    }
}
