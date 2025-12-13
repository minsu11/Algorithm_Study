import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int first = 0;
        int idx =1;
        while(true){
            first = Integer.parseInt(Integer.toBinaryString(idx)) *5;
            idx++;
            if(first > r){
                break;
            }
            else if(l <= first && first <= r){
                list.add(first);    
            }
            
        }   
        if(list.size() == 0){
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}