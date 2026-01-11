import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) { 
        int len = progresses.length;
        int cnt = 0;
        int maxDay= 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            
            if(remain % speeds[i] != 0){
                day++;
            }
            
            if(maxDay < day){
                if(cnt != 0){
                    list.add(cnt);
                }
                cnt = 1;
                maxDay = day;
            }else if(maxDay >= day){
                cnt++;
            }
        }
        list.add(cnt);
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);            
        }
        
        return answer;
    }
}