package ICPC;

import java.util.Scanner;
class CuttingSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int l = scanner.nextInt(); // Length of the stick
            if (l == 0) {
                break;
            }

            int n = scanner.nextInt(); // Number of cuts
            int[] cuts = new int[n + 2]; // Add 0 and l to the cuts array
            cuts[0] = 0;
            for (int i = 1; i <= n; i++) {
                cuts[i] = scanner.nextInt();
            }
            cuts[n + 1] = l;

            int[][] dp = new int[n + 2][n + 2];

            // Calculate the minimum cost using dynamic programming
            for (int len = 2; len <= n + 1; len++) {
                for (int i = 0; i + len <= n + 1; i++) {
                    int j = i + len;
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i + 1; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + (cuts[j] - cuts[i]));
                        // The cost is the sum of the cost of cutting the left part, the cost of cutting the right part, and the length of the stick being cut.
                    }
                }
            }

            System.out.println("The minimum cutting is " + dp[0][n + 1] + ".");
        }
        scanner.close();
    }
}
