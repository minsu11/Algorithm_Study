import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i<= discount.length-10; i++){
            
            for(int j = i; j < i+10; j++){
                map.put(discount[j], map.getOrDefault(discount[j], 0) +1);    
            }
            boolean check = true;
            for(int j = 0; j < want.length; j++){
                
                if(!map.containsKey(want[j])){
                    check = false;
                    break;
                }
                
                int num = map.get(want[j]);
                if(num != number[j]){
                    check = false;
                    break; 
                }
            }
            
            if(check){
                answer+=1;
            }
            map = new HashMap<>();
        }
        
        return answer;
    }
}