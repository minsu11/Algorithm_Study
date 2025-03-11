import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long result1 = 0;
        long result2 =0;
        int size = queue1.length;
        Queue<Integer> cpQueue1 = new LinkedList<>();
        Queue<Integer> cpQueue2 = new LinkedList<>();
        
        
        for(int i = 0; i < queue1.length; i++){
            cpQueue1.add(queue1[i]);
            cpQueue2.add(queue2[i]);
            result1 += queue1[i];
            result2 += queue2[i];
        }
        if(result1 + result2 % 2 == 1){
            return -1;
        }
        for(int i = 0; i <= 3*size -3; i++){        
            int num = 0;
            if(result1 == result2){
                return answer;
            }
            else if(result1 < result2){
                num = cpQueue2.poll();
                cpQueue1.add(num);
                answer++;
                result2 -= num;
                result1 += num;
                
            }
            else if(result2 < result1){
                num = cpQueue1.poll();
                cpQueue2.add(num);
                answer++;
                result1 -= num;
                result2 += num;
            }
           
            
        }
        
        return -1;
    }
   
}