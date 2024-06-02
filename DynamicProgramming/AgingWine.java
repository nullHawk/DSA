package DynamicProgramming;

import java.util.Arrays;

public class AgingWine {
    //Given N wines. Each year you can sell either the left most or the right most wine. The price of the wines increases every year. Find the maximum profit you can make by selling all the wines.
    
    //Recursive function
    int maxProfit(int[] wines, int i, int j, int year){
        if(i > j){
            return 0;
        }
        return Math.max(wines[i]*year + maxProfit(wines, i+1, j, year+1), wines[j]*year + maxProfit(wines, i, j-1, year+1));
    }

    int maxProfiItr(int[] wines){
        int n = wines.length;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = wines[i]*n;
        }
        for(int len = 2; len <= n; len++){
            for(int i = 0; i <= n-len; i++){
                int j = i+len-1;
                int year = n-len+1;
                dp[i][j] = Math.max(wines[i]*year + dp[i+1][j], wines[j]*year + dp[i][j-1]);
            }
        }
        return dp[0][n-1];

    }

    public static void main(String[] args) {
        int[] wines = {2,4,6,2,5};
        AgingWine aw = new AgingWine();
        // System.out.println(aw.maxProfit(wines, 0, wines.length-1, 1));
        System.out.println(aw.maxProfiItr(wines));
    }
    
}
