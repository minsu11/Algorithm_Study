import java.util.*;
class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 본인은 1
        boolean[] visited = new boolean[n];
       
        Deque<Integer> q= new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            q.add(i);
            visited[i] = true;
            while(!q.isEmpty())
            {
                int cur = q.poll();
                for(int next = 0; next < n; next++){
                    if (cur == next) continue;
                    if(!visited[next] && computers[cur][next] ==1){
                        q.add(next);
                        visited[next]=true;
                    }
                }
            }
            
            answer++;
            
        }
        
        
        return answer;
    }
    
    
    
}