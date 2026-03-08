import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < topping.length; i++){
            map.put(topping[i] , map.getOrDefault(topping[i], 0)+1);
        }
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < topping.length; i++){
            int num = topping[i];
            set.add(num);
            int x = map.get(num) - 1 ;
            if(x == 0){
                map.remove(num);
            }else{
                map.put(num, x);
            }
            
            if(set.size() == map.size()){
                answer+=1;
            }
            
        }
        
        
        return answer;
    }
}