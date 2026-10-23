import java.util.*;
class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        List<int[]> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < plans.length; i++){
            String country = plans[i][0];
            String[] timeStr = plans[i][1].split(":");
            int time = Integer.parseInt(timeStr[0]) * 60 + Integer.parseInt(timeStr[1]);
            map.put(i, country);
            list.add(new int[]{i, time, Integer.parseInt(plans[i][2])});
        }
        list.sort((a,b)->Integer.compare(a[1], b[1]));
        Deque<int[]> q = new ArrayDeque<>(list);
        Deque<int[]> readyQue = new ArrayDeque<>();
        int curTime = 0;
        int idx = 0;
        int size = 0;
        while(!q.isEmpty()){
            int[] value = q.poll();
            int curIdx = value[0];
            int startTime = value[1];
            int usingTime = value[2];
            int[] next;
            if(q.peek() == null){
                answer[idx] = map.get(curIdx);
                idx+=1;
                while(!readyQue.isEmpty()){
                    int[] v = readyQue.pollLast();
                    answer[idx] = map.get(v[0]);
                    idx+=1;
                }
                break;
            }
            
            next= q.peek();
            if(startTime + usingTime > next[1]){
                usingTime = usingTime - (next[1] - startTime);
                readyQue.add(new int[]{curIdx, startTime, usingTime});
            }
            else{
                curTime = startTime + usingTime;
                answer[idx] = map.get(curIdx);
                idx+=1;
                
                while(!readyQue.isEmpty()){
                    int[] v = readyQue.pollLast();
                    if(curTime + v[2] > next[1]){
                        int x = v[2] - (next[1] - curTime);
                        readyQue.add(new int[]{v[0], v[1], x });
                        break;
                    }else{
                        curTime += v[2];
                        answer[idx] = map.get(v[0]);
                        idx+=1;
                    }
                }
            }
            
            
           
        }
        
        return answer;
    }
}