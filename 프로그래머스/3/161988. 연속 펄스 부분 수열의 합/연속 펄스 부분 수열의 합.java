import java.util.*;
class Solution {
    public long solution(int[] sequence) {
        int n = sequence.length;

        int[] dir1 = {1,-1};
        int[] dir2 = {-1,1};
        long[] dp1 = new long[n+1];
        long[] dp2 = new long[n+1];
        dp1[0] = sequence[0] * 1;
        dp2[0] = sequence[0] * -1;
        long answer = Math.max(dp1[0], dp2[0]);

        for(int i = 1; i < n; i++){
            long value1 = (long) sequence[i] * dir1[i%2];
            long value2 = (long) sequence[i] * dir2[i%2];
            dp1[i] = Math.max(value1, dp1[i-1] + value1);
            dp2[i] = Math.max(value2, dp2[i-1] + value2);
            answer = Math.max(answer, Math.max(dp1[i],dp2[i]));
        }
        
        
        return answer;
    }
    
}