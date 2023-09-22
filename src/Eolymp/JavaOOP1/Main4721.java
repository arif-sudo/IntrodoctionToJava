package Eolymp.JavaOOP1;

import java.util.Scanner;

public class Main4721 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();

        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '5'){
                count++;
            }
        }
        System.out.println(count);
    }

}
