package Eolymp.Strings;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }

    public static boolean inRange(int n){ // check if every split is in range 0-255
            if (n >= 0 && n <= 255) {
                return true;
            }
            return false;
        }

        public static int isValid(String s){
            String[] parts = s.split("\\.");
            if (parts.length != 4) {
                return 0;
            }
            for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        if (!inRange(num)) {
                            return 0;
                        }
                    }
                    catch (NumberFormatException e) {
                        return 0;
                    }
            }
            return 1;
    }
}

