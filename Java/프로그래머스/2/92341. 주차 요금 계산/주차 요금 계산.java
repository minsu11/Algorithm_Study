import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> inMap = new HashMap<>();
        Set<String> set = new TreeSet<>();
        for(String r : records){
            String[] str = r.split(" ");
            set.add(str[1]);
            String[] timeStr = str[0].split(":");
            Integer time = Integer.parseInt(timeStr[0]) * 60 + Integer.parseInt(timeStr[1]);
            if(str[2].equals("IN")){
                inMap.put(str[1], time);
            }else if(str[2].equals("OUT")){
                time = time - inMap.get(str[1]);
                inMap.remove(str[1]);
                map.put(str[1], map.getOrDefault(str[1], 0) + time);
            }
        }
        int endTime = 23* 60 + 59;
        for(String key : set){
            if(inMap.containsKey(key)){
                map.put(key, map.getOrDefault(key, 0) + (endTime - inMap.get(key)));
                inMap.remove(key);
            }    
        }
        int[] answer = new int[map.size()];
        int idx = 0;
        for(Integer num : map.values()){
            if(num <= fees[0]){
                answer[idx] = fees[1];
                idx+=1;
                continue;
            }
            int time = num - fees[0];
            int price = fees[1]+((time / fees[2]+ (time%fees[2] == 0 ? 0 : 1)) * fees[3]);
            answer[idx] = price;
            idx+=1;
        }
        
        return answer;
        
    }
}