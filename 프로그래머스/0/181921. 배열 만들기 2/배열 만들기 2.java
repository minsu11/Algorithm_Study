import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int first = 0;
        int idx =0;
        for(int i = 1; first < l ;i++){
            first = Integer.parseInt(Integer.toBinaryString(i)) *5;
            idx = i;
        }
        
        if(first > r){
            return new int[]{-1};
        }else if (first == r){
            return new int[]{first};
        }
        
        
        for(int i = idx; ; i++){
            first = Integer.parseInt(Integer.toBinaryString(i)) *5;
            if(first > r){
                break;
            }
            list.add(first);
        }
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}