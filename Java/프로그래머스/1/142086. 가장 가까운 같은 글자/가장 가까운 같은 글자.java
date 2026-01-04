import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        Map<String, Integer> map = new HashMap<>();
        String[] str = s.split("");
        int[] answer = new int[str.length];
        
       
        for(int i = 0; i < str.length; i++){
            if(map.containsKey(str[i])){
                int n = map.get(str[i]);
                answer[i] = i - n;
            }else{
                answer[i] = -1;
            }
            
            
            map.put(str[i], i);
        }
        return answer;
    }
}