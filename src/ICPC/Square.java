package ICPC;
import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][n];
        int maxSquareSize = 0;

        // Initialize the first row and first column of dp array
        for (int i = 0; i < n; i++) {
            dp[i][0] = grid[i][0];
            dp[0][i] = grid[0][i];
            maxSquareSize = Math.max(maxSquareSize, grid[i][0]);
            maxSquareSize = Math.max(maxSquareSize, grid[0][i]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    maxSquareSize = Math.max(maxSquareSize, dp[i][j]);
                }
            }
        }

        int waysToCut = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == maxSquareSize) {
                    waysToCut++;
                }
            }
        }
        System.out.println("-");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("");
        }

        int result = maxSquareSize * waysToCut;
        System.out.println(result);
    }
}

