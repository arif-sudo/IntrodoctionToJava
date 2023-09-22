    package Eolymp;

    import java.util.Scanner;

    public class Main8630 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            long n = scan.nextLong();
            int M = Character.getNumericValue(String.valueOf(n).charAt(0));
            for (int i = 0; i < String.valueOf(n).length(); i++) {
                if (Character.getNumericValue(String.valueOf(n).charAt(i)) > M){
                    M = Character.getNumericValue(String.valueOf(n).charAt(i));
                }
            }
            System.out.println(M);
        }
    }
