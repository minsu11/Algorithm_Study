import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 1;
        boolean[] visited = new boolean[cards.length];
        int start = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i =0; i < cards.length; i++){
            if(!visited[i]){
                int cur = i;
                int count = 0; 
                
               while (!visited[cur]) {
                    visited[cur] = true;
                    cur = cards[cur] - 1;
                    count++;
                }
                if(count > 0){
                    
                    list.add(count);
                }
            }
        }
        if(list.size() <  2){
            return 0;
        }

       
        Collections.sort(list);
        int size = list.size();
        return list.get(size-1) * list.get(size-2);
    }
}