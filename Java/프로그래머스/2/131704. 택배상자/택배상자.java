import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        int belt = 1;
        for(int i =0; i< order.length; i++){
            int targetNum = order[i];
            
            while( belt <= order.length &&  belt < targetNum){
                stack.push(belt);
                belt+=1;
            }
            
            if(belt == targetNum){
                belt+=1;
                answer++;
                continue;
            }
            
            if(stack.peek() == targetNum ){
                stack.pop();
                answer++;
                continue;
            }
            break;
            
            
        }
        return answer;
    }
}