package Eolymp.JavaOOP3;

    import java.util.Scanner;

    public class Main2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            long n = scan.nextLong();
            if (n < 0) n = -n;
            int k = 0;
            if (n == 0){
                k = 1;
            }
            while (n > 0){

                n /= 10;
                k++;
            }
            System.out.println(k);
        }
    }
