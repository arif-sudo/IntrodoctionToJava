package Eolymp.JavaOOP2;

    import java.util.Scanner;

    public class Main513 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            long n = scan.nextLong();
            int m = scan.nextInt();
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result = (result * i) % m;
            }
            System.out.println(result);
        }
    }
