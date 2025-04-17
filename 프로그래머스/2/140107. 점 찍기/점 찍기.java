import java.util.*;
class Solution {
    public long solution(int k, int d) {
        // k: 점에 대한 갯수
        // d: 거리
        long answer = 0;
        
        for(int i = 0; i <= d; i+=k){
            long b = (long)Math.sqrt(Math.pow(d,2) - Math.pow(i,2));
            answer+=b/k+1;
        }

        
        return answer;
    }
    
   
    
}