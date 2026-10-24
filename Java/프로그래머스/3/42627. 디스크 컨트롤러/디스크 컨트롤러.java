import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, (a,b)->{
           if(a[0]!= b[0]){
               return a[0]-b[0];
           } 
            
            return a[1] - b[1];
          
        });
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b) -> {
                        if(a[1]  != b[1]){
                            return a[1]  - b[1] ;
                        }else if(a[0] != b[0]){
                            return a[0] - b[0];
                        }else{
                            return a[2] -b[2];
                        }
        });
        // 요청 시간
        pq.add(new int[]{jobs[0][0], jobs[0][1], 0});
        int idx = 1;
        int time = jobs[0][0];
        while(!pq.isEmpty()){
            int[] value = pq.poll();
            // 현재 진행중인 시간
            time += value[1];
            answer = answer + ( time - value[0]) ; //
            for(int i = idx; i < jobs.length; i++){
                if(jobs[i][0] >time){
                    break;
                }
                pq.add(new int[]{jobs[i][0], jobs[i][1], i});
                idx+=1;
            }
            if(pq.isEmpty() && idx < jobs.length){
                pq.add(new int[]{jobs[idx][0], jobs[idx][1], idx});
                time = jobs[idx][0];
                idx+=1;
            }
            
        }
       
        
        
        
        
        
        return answer/ jobs.length;
    }
}