import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int number: d){
            list.add(number);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            if(budget - list.get(i) <0){
                break;
            }
            budget -= list.get(i);
            answer++;
            
        }
            
        return answer;
        
    }
}