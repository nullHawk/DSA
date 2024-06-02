package DynamicProgramming;

public class DistinctSubsequence {
    //Given 2String A&B count the number of unique ways in which we can get string B as a subsequence of String B do this requersively
    //leet code quetion link: https://leetcode.com/problems/distinct-subsequences/

    //apply dp table recursilvely
    int ways(String a, String b, int n, int m, int[][] dp){
        if(m == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(a.charAt(n-1) == b.charAt(m-1)){
            dp[n][m] = ways(a, b, n-1, m-1, dp) + ways(a, b, n-1, m, dp);
        }
        else{
            dp[n][m] = ways(a, b, n-1, m, dp);
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        DistinctSubsequence ds = new DistinctSubsequence();
        String a = "rabybxbit";
        String b = "rabbit";
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(ds.ways(a, b, n, m, dp));
    }
    
}
