import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start = 0;
        int last = 0;
        int sum = 0;
        int[] seq = sequence;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < seq.length; i++){
            sum+= seq[i];
            
            while(sum > k){ 
                sum -= seq[start];
                start+=1;
            }
            if(sum == k && min > i - start){
                answer[0] = start;
                answer[1] = i;
                min = i - start;
            }
        }
        
        
        return answer;
    }
    
}