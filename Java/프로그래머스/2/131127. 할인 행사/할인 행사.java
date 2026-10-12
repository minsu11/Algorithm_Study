import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < 10; i++){
            map.put(discount[i], map.getOrDefault(discount[i], 0) +1);    
        }
        
        for(int i = 0; i <= discount.length - 10; i++){
                
            boolean check = true;
            for (int j = 0; j < want.length; j++) {
                if (map.getOrDefault(want[j], 0) != number[j]) {
                    check = false;
                    break;
                }
            }
            
            if(check){
                answer+=1;
            }
            
            if (i == discount.length - 10) {
                break;
            }
           String nextKey = discount[i + 10];

            if (!nextKey.equals(discount[i])) {
                map.put(discount[i], map.get(discount[i]) - 1);
                map.put(nextKey, map.getOrDefault(nextKey, 0) + 1);

                if (map.get(discount[i]) == 0) {
                    map.remove(discount[i]);
                }
            }
            
        }
        
        return answer;
    }
}