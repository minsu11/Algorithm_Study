import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start = 0;
        int last = 0;
        int sum = 0;
        int[] seq = sequence;
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < seq.length; i++){
            sum+= seq[i];
            
            while(sum > k){ 
                sum -= seq[start];
                start+=1;
            }
            if(sum == k){
                list.add(new int[]{start,i, i - start});
            }
        }
        int min = Integer.MAX_VALUE;
        
        for(int[] arr : list){
            if(min > arr[2]){
                answer[0] = arr[0];
                answer[1] = arr[1];
                min = arr[2];
            }
        }
        return answer;
    }
    
}