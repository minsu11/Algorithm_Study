import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long q1 = 0L;
        long q2 = 0L;
        long n1 = 0L;
        long n2 = 0L;
        Deque<Integer> que1 = new ArrayDeque<>();
        Deque<Integer> que2 = new ArrayDeque<>();
       
        for(int i = 0; i < queue1.length; i++){
            q1+=queue1[i];
            q2+=queue2[i];
            que1.add(queue1[i]);
            que2.add(queue2[i]);
        }
        while(answer <= queue1.length * 4 ){
            if(q1 == q2){
                return answer;
            }
            
            
            
            int num =0;
            if(q1 > q2){
                num = que1.poll();
                que2.add(num);
                q1 -= num;
                q2 +=num;
            }else {
                num = que2.poll();
                que1.add(num);
                q1 +=num;
                q2 -=num;
            }
            answer+=1;
            
            
        }
        
        return -1;
    }
   
}