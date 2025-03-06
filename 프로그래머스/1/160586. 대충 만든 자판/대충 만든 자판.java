import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < keymap.length; i++){
            String[] str = keymap[i].split("");
            for(int j = 0; j < str.length; j++){
                if(map.containsKey(str[j]) && map.get(str[j]) < j+1){
                    continue;
                }
                map.put(str[j],j+1);
            }
        }
        
    
        for(int i= 0; i < targets.length; i++){
            String[] str = targets[i].split("");
            int result = 0;
            for(int j = 0; j < str.length; j++){
                if(!map.containsKey(str[j])){
                    result = -1;
                    break;
                }
                
                result += map.get(str[j]);
            }
        
            answer[i] = result;
        }
        
        
        
        return answer;
    }
}