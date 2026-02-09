import java.util.*;
class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1L;
        long time = 1L;
        int cityLen = g.length;
        long lo = 0L;
        long hi = 1L;
        long mid = 0L;
        // (2k - 1) * t = T
        // k = (T / t +1) /2
        while(true){
            
            long total = 0L;
            long sumGold = 0L;
            long sumSilver = 0L;
            for(int i = 0; i < cityLen; i++){
                long round = time/ (t[i] * 2L);
                long rem = time % (2L * t[i]);
                long trip = round + (rem >= t[i] ? 1 : 0);
                long caps = trip * (long) w[i];
                sumGold += Math.min((long)g[i], caps);
                sumSilver +=  Math.min((long)s[i], caps);
                total += Math.min((long) g[i] + s[i], caps);
            }
            boolean ok = (sumGold >= (long)a) && (sumSilver >= (long)b) && (total >= (long) a + b);
           if(ok){
               mid = time;
               break;
           }else{
               time *=2;
           }
        }
        hi = mid;
        
        while(lo< hi){
            mid = (hi + lo) /2;
            
            long total = 0L;
            long sumGold = 0L;
            long sumSilver = 0L;
            for(int i = 0; i < cityLen; i++){
                long round = mid/ (t[i] * 2L);
                long rem = mid % (2L * t[i]);
                long trip = round + (rem >= t[i] ? 1 : 0);
                long caps = trip * (long) w[i];
                sumGold += Math.min((long)g[i], caps);
                sumSilver +=  Math.min((long)s[i], caps);
                total += Math.min((long) g[i] + s[i], caps);
            }
            boolean ok = (sumGold >= (long)a) && (sumSilver >= (long)b) && (total >= (long) a + b);
            
            
            if(ok){
                hi = mid;
            }else{
                lo= mid + 1;
            }
            
        }
        answer = hi;
        return answer;
    }
}