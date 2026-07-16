class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][land[0].length];
        for(int i = 0; i < land[0].length; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                int num = land[i][j]; // 기준 점
                for(int k = 0 ; k < land[0].length; k++){
                   if(k != j && dp[i][j] < num + dp[i-1][k]){
                       dp[i][j] = num + dp[i-1][k];
                   } 
                    
                }
                
            }
            
        }
        
        for(int i = 0; i < dp[0].length; i++){
            if(answer < dp[dp.length-1][i]){
                answer = dp[dp.length - 1][i];
            }
        }
        
        return answer;
    }
}