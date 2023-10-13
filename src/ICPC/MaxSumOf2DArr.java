package ICPC;

import java.util.Scanner;

public class MaxSumOf2DArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        int maxSum = findMaximumSumRectangle(table);
        System.out.println(maxSum);
    }

    public static int findMaximumSumRectangle(int[][] table) {
        int n = table.length;
        int maxSum = Integer.MIN_VALUE;

        for (int left = 0; left < n; left++) {
            int[] temp = new int[n];
            for (int right = left; right < n; right++) {
                for (int i = 0; i < n; i++) {
                    temp[i] += table[i][right];
                }
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }

    public static int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
