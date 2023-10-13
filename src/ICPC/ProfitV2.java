package ICPC;
import java.util.Scanner;

public class ProfitV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] profits = new int[n];

        for (int i = 0; i < n; i++) {
            profits[i] = input.nextInt();
        }

        int maxProfit = Integer.MIN_VALUE;
        int currentProfit = 0;

        for (int i = 0; i < n; i++) {
            currentProfit = Math.max(profits[i], currentProfit + profits[i]);
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        System.out.println(maxProfit);
    }
}
