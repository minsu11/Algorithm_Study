import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int idx = 0;
        answer.add(arr[0]);
        for(int num : arr){
            if(answer.get(idx) != num){
                idx++;
                answer.add(num);
            }
        }
       
        return answer.stream().mapToInt(Integer::intValue)
            .toArray();
    }
}