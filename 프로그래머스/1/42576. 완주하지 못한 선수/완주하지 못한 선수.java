import java.util.*;
class Solution {
    // participant: 참여한 선수들의 이름
    // completion: 완주한 선수들의 이름
    // completion.length =  participant.length -1 
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String c : completion){
            if(map.containsKey(c)){
                map.put(c, map.get(c) +1);
                continue;
            }
            map.put(c, 1);
        }
        
        for(String p : participant){
            if(!map.containsKey(p)){
                return p;
            }
            int value = map.get(p) -1;

            if(value == 0){
                map.remove(p);

            }else{
            map.put(p, value);    
            }
            
        }
        for(String key : map.keySet()){
            answer = key;
        }
        
        return answer;
        
        
    }
}