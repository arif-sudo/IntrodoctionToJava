package Eolymp.Strings;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().trim();
        if (str.startsWith(" ")) {
            str = str.substring(1);
        }
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }

        System.out.println(str);
    }
}
