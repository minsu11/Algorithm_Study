import java.util.*;
class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n+1];
        Deque<Integer> que = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            que.add(i);
            visited[i] = true;
            
            while(!que.isEmpty()){
                int cur = que.poll();
                int[] value = computers[cur];
                
                for(int j = 0; j < n; j++){
                    if(visited[j]){
                        continue;
                    }
                    
                    if( value[j] == 1 && computers[j][cur] == 1){
                        que.add(j);
                        visited[j] = true;
                    }
                }
                
            }
            
            
            answer+=1;
        }
        
        return answer;
    }
    
    
    
}