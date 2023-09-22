package Eolymp;

import java.util.Scanner;

public class Main8533 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean flag;
        String res = "";
        while (a < b + 1){
            flag = true;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (String.valueOf(a).charAt(i) == String.valueOf(a).charAt(j)){
                        flag = false;
                    }
                }
            }
            if (flag) res = res + a + " ";
            a++;
        }
        System.out.println(res);
    }
}
