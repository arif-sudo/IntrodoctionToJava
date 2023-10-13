package HRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            arr[i] = k;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                int[] newArr = new int[j+1];
                for (int k = i; k <= j; k++) {
                    newArr[k] = arr[k];
                }
                if (sum(newArr) > 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=