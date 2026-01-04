import java.util.*;
class Solution {
    
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int size = tangerine.length;
        int[] cntArr = new int[size+1];
        
        for(int x : tangerine){
            freq.put(x, freq.getOrDefault(x,0) +1);
        }
        
        for(int c : freq.values()){
            cntArr[c]++;
        }
       
        for(int i = size; i >=0; i--){
            if(cntArr[i] ==0){
                continue;
            }
            int type = cntArr[i];
            int total = cntArr[i] * i;
            
            if(total <= k){
                answer += type;
                k -= total;
            }
            else{
                answer += (k+i-1)/i;
                break;
            }
        }
        return answer;
    }
}