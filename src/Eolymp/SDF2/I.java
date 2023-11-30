package Eolymp.SDF2;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Process each pair of integers
        while (scanner.hasNext()) {
            // Read the pair of integers
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b == 0) {
                System.out.println("Division by zero");
            } else {
                int result = a / b;
                System.out.println(result);
            }
        }
    }
}
