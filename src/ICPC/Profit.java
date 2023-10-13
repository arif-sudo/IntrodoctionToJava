package ICPC;

import java.util.ArrayList;
import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = scan.nextInt();
            arr.add(i,m);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> na = new ArrayList<>();
                for (int k = i; k <= j ; k++) {
                    na.add(arr.get(k));
                    sum = 0;
                    for (int l = 0; l < na.size(); l++) {
                        sum += na.get(l);
                    }
                    if (sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
