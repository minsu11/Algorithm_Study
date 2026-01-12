import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        Arrays.sort(indices);
        
        for(int i = 0; i < my_string.length(); i++){
            if(idx < indices.length && indices[idx] == i){
                idx++;
                continue;
            }
            answer.append(String.valueOf(my_string.charAt(i)));
        }
        
        return answer.toString();
    }
}