package DynamicProgramming;

public class Knapsack {
    //Given N items each with a wight and a value/ Find the max value that can be obtained by picking items such that total weight <= max capacity of knapsack.

    //Recursive function
    int knapsack(int[] weight, int[] value, int i, int w, int n){
        if(i == n || w == 0){
            return 0;
        }
        if(weight[i] > w){
            return knapsack(weight, value, i+1, w, n);
        }
        return Math.max(value[i] + knapsack(weight, value, i+1, w-weight[i], n), knapsack(weight, value, i+1, w, n));
    }

    //Itrative function
    int knapsackItr(int[] weight, int[] value, int w, int n){
        int[][] dp = new int[n+1][w+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= w; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(weight[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(value[i-1] + dp[i-1][j-weight[i-1]], dp[i-1][j]);
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        int[] weight = {20, 10, 30, 40};
        int[] value = {100, 60, 120, 150};
        int w = 50;
        Knapsack k = new Knapsack();
        // System.out.println(k.knapsack(weight, value, 0, w, weight.length));
        System.out.println(k.knapsackItr(weight, value, w, weight.length));
    }
    
}
