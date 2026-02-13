import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Deque<int[]> q = new ArrayDeque<>();
        int currentWeight = truck_weights[0];
        int idx = 1;
        q.add(new int[]{0, truck_weights[0]});
        while(!q.isEmpty()){
            if(q.peek()[0] + bridge_length == answer){
                int[] n = q.poll();
                currentWeight -= n[1];
            }
            
            
            if(idx < truck_weights.length 
               && currentWeight + truck_weights[idx] <= weight
            && q.size()<bridge_length
              ){
                currentWeight += truck_weights[idx];
                q.add(new int[]{answer, truck_weights[idx]});
                idx++;
            }
            
            answer++;
            
        }
        
        
        return answer;
    }
}