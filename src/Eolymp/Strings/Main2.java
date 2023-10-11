package Eolymp.Strings;

import java.util.Scanner;
public class Main2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while(scanner.hasNextInt()){
                int n = scanner.nextInt();
                for (int i = 0; i < n ;i++){
                    for (int k = 0; k < n - i - 1 ;k++ ) System.out.print(' ');
                    for (int j = 0; j < i*2+1 ; j++ ) System.out.print('*');
                    System.out.print('\n');
                }
                for (int i = 1; i < n ;i++){
                    for (int k = 0; k < i ;k++ ) System.out.print(' ');
                    for (int j = 0; j < (n-i)*2-1 ; j++ ) System.out.print('*');
                    System.out.print('\n');
                }
                System.out.print('\n');
            }
        }
}