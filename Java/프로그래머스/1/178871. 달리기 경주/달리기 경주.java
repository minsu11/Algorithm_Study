import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
     
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(String s: callings){
            Integer playerIdx = map.get(s);
            
            String tmp = players[playerIdx];
            players[playerIdx] = players[playerIdx-1]; 
            players[playerIdx - 1] = tmp;
            
            map.put(s, playerIdx - 1);
            map.put(players[playerIdx], playerIdx);
        }
        String[] answer = players;
        
        return answer;
    }
}