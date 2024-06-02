package DynamicProgramming;

public class WildCardMatching {
    public boolean isMathing(String a, String p){
        int n = a.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i = 1; i <= m; i++){
            if(p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-1];
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else if(p.charAt(j-1) == '?' || a.charAt(i-1) == p.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[n][m];
    }

    boolean match(String a, int i, String b, int j){
        if(b.charAt(j) != '*'){
            if(a.charAt(i) == b.charAt(j)){
                return match(a, i-1, b, j-1);
            }else{
                return false;
            }  
        }
        if(b.charAt(j) == '?'){
            return match(a,i-1,b,j-1);
        }else{
            return match(a,i-1,b,j-1) || match(a,i,b,j-1);
        }
    }

    public static void main(String[] args) {
        WildCardMatching wcm = new WildCardMatching();
        String a = "adceb";
        String p = "*a*b";
        System.out.println(wcm.match(a,0, p,0));
    }
    
}
