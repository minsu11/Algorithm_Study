import java.util.*;
class Solution {
    // n: a 도둑이 경찰에 붙잡히는 최소 흔적 개수
    // m: b 도둑이 경찰에 붙잡히는 최소 흔적 개수
    // info: 각 물건을 훔칠 때 생기는 흔적에 대한 정보 담은 2차원 정수 배열
    public int solution(int[][] info, int n, int m) {
        int answer = 0;
        int len = info.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] =0;        
        
        for(int i = 0; i < len; i++){
            int numA = info[i][0];
            int numB = info[i][1];
            int[] nextDp = new int[n];
            Arrays.fill(nextDp, Integer.MAX_VALUE);
            
            for(int j = 0; j < n; j++){
                if(dp[j] ==Integer.MAX_VALUE){
                    continue;
                }
                
                if(dp[j] + numB < m){
                    nextDp[j] = Math.min(nextDp[j], dp[j] + numB);
                }
                
                if(numA + j < n){
                    nextDp[numA+j] = Math.min(nextDp[numA+j], dp[j]);
                }
                
            }
            
            dp = nextDp;
        }
        for (int i = 0; i < n; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                return i;
            }
        }

        return -1;
    }
}