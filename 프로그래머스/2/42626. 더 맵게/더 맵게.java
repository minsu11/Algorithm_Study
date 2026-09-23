import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int size = scoville.length;
        Queue<Integer> que = new PriorityQueue<>();
        for(int i = 0; i < size; i++){
            que.add(scoville[i]);
        }
        while(que.size() >=2){
            int n1 = que.poll();
            if(n1 >= K){
                return answer;
            }
            int n2 = que.poll();
            
            int sum = n1 + (n2*2);
            que.add(sum);
            answer+=1;
        }
        
        if(que.poll() >= K){
            return answer;
        }
        
        return -1;
    }
}