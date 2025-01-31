import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        // 정렬 먼저
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }
        answer.sort(Integer::compareTo);
        if(answer.size() ==0){
            answer.add(-1);
        }        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}