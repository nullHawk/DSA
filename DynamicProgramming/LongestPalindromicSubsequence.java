package DynamicProgramming;

public class LongestPalindromicSubsequence {
    //write recusrive function
    int longestPalindromicSubsequence(String s, int i, int j, int[][] dp){
        if(i > j){
            return 0;
        }
        if(i == j){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = 2 + longestPalindromicSubsequence(s, i+1, j-1, dp);
        }
        else{
            dp[i][j] = Math.max(longestPalindromicSubsequence(s, i+1, j, dp), longestPalindromicSubsequence(s, i, j-1, dp));
        }
        return dp[i][j];
    }

    public static void main(String[] args) {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        String s = "bbbab";
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(lps.longestPalindromicSubsequence(s, 0, n-1, dp));
    }
    
}
