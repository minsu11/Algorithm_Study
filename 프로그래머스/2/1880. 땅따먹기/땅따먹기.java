import java.util.*;
class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int col = land.length;
        int row = land[0].length;
        int[][] dp = land;
        
        for(int i = 1; i < dp.length; i++){
            // j는 현재 행
            for(int j = 0; j < 4; j++){
                // k는 다음 행
                int max = 0;
                for(int k =0; k < 4; k++){
                    if(k != j && max < dp[i-1][k]){
                        max = dp[i-1][k];
                    }
                }
                dp[i][j] += max;
            }
        }
        
        for(int i = 0; i < 4; i++){
            if(answer < dp[dp.length-1][i]){
                answer = dp[dp.length-1][i];
            }    
        }
        return answer;
    }
    
    
}