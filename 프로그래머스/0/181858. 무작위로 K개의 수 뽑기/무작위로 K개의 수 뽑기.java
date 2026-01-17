import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < k; i++){
            answer[i] = -1;
        }
        for(int n : arr){
            set.add(n);
        }
        
        Iterator<Integer> it = set.iterator();
        int idx =0;
        while(it.hasNext()){
            if(idx >=k){
                break;
            }
            answer[idx] = it.next();
            idx++;
        }
        
        return answer;
    }
}