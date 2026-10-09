import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        int belt = 1;
        for(int i =0; i< order.length; i++){
            int targetNum = order[i];
            if(!stack.isEmpty() && stack.peek() == targetNum ){
                stack.pop();
                answer++;
                continue;
            }
            else if(belt == targetNum){
                belt+=1;
                answer++;
                continue;
            }
            
            
            while(targetNum != belt && belt <= order.length){
                stack.push(belt);
                belt+=1;
            }
            
            
            if(stack.peek() == targetNum ){
                stack.pop();
                answer++;
                continue;
            }
            else if(belt == targetNum){
                belt+=1;
                answer++;
                continue;
            }else{
                break;
            }
            
        }
        return answer;
    }
}