import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < k; i++){
            answer[i] = -1;
        }
        int idx = 0;
        for(int n : arr){
            if(set.add(n)){
                answer[idx++] = n;
                if(idx == k){
                    break;
                }
                
            }
        }
        return answer;
    }
}