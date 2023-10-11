package Eolymp.Strings;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        str = str.replaceAll(" ", "");
        int start = 0;
        int end = str.length() - 1;
        boolean flag = true;
        while(start < end){
            if (str.charAt(start) != str.charAt(end)){
                flag = false;
            }
            start++;
            end--;
        }
        System.out.println(flag ? "YES" : "NO");
    }
}

