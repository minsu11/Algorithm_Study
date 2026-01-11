import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) { 
        int len = progresses.length;
        int[] dayArr = new int[len];
        int finishIdx = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            int num = (100 - progresses[i]) / speeds[i];
            int x = (100 - progresses[i]) % speeds[i] != 0 ? 1 : 0;
            dayArr[i] = num+x;
        }
        
        
        int cnt = 0;
        for(int i=0; i < len; i++){
            System.out.println(dayArr[i]);
            if(dayArr[finishIdx] >= dayArr[i]){
                cnt++;
            }
            else{
                list.add(cnt);
                cnt = 1;
                finishIdx = i;
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