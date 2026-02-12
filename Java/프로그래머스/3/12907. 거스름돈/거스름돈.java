class Solution {
    // dp 문제
    public int solution(int n, int[] money) {
        int answer = 0;
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int coin : money){
            for(int x = 1; x <=n ; x++){
                if(x - coin >= 0){
                    
                    dp[x] = dp[x]+dp[x-coin];
                }
            }
        }
       
        
        return dp[n] % 1000000007;
    }
    
    
}