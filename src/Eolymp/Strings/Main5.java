package Eolymp.Strings;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = scanner.nextInt();
        String result = "";

        for (int i = 0; i < str.length(); i++){
            // System.out.println(str.charAt(i) - n);
            if (str.charAt(i) - n < 65){
                result += Character.toString(str.charAt(i) - n + 26);
            }else{
                result += Character.toString(str.charAt(i) - n);
            }
        }
        System.out.println(result);
    }
}
