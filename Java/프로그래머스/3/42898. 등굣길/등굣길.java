import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int idx = 0;
        int[][] dp = new int[n+1][m+1];
        Arrays.sort(puddles, (a, b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=m; j++){
                if(i == 1 && j == 1){
                    dp[1][1]= 1;
                    continue;
                }
                
                boolean check = false;
                if(idx < puddles.length && puddles[idx][0] == j && puddles[idx][1] == i){
                    check = true;
                    idx+=1;
                    continue;
                }
                
                if(check){
                    continue;
                }
                
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1_000_000_007;
            }
        }
        
        
        return dp[n][m] ;
    }
}