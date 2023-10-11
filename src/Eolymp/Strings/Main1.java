package Eolymp.Strings;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num ; i++){
            for (int j = num - i - 1; j > 0; j--){
                count++;
            }
            for (int j = 0; j < i*2+1 ; j++){
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < num ; i++){
            for (int j = num - i - 1; j > 0; j--){
                System.out.print(' ');
                count++;
            }
            for (int j = 0; j < i*2+1 ; j++){
                System.out.print(ch);
                count++;
            }
            System.out.print('\n');
        }
        scanner.close();
    }
}