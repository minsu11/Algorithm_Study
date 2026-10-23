import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        // n 목표 숫자
        // times 입국 심사관이 걸리는 시간
        Arrays.sort(times);
        long answer = 0;
        long right = (long) times[times.length-1] * n; // 60
        long left = 0;
        long mid = right / 2; // 30
        
        while(left<right){
            // mid 기준 되는가 안되는가
            long people = 0;
            for(int i = 0; i < times.length; i++){
                people += mid / times[i];
            }
            
            if(left != right && people < n){
                left = mid+1;
            }
            else if (left != right && people >= n){
                right = mid;
            }
            
            mid = (right+ left) / 2;
            
        }
        
        
        return left;
    }
}