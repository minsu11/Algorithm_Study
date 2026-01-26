import java.util.*;
class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 본인은 1
        boolean[] visited = new boolean[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < computers.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < computers[i].length; j++){
                if(i != j && computers[i][j] == 1){
                    list.add(j);
                }
            }
            map.put(i, list);
        }
        
        Deque<Integer> q= new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            q.add(i);
            while(q.size()>0)
            {
                int cur = q.poll();
                List<Integer> list = map.get(cur);
                visited[cur] = true;
                for(int j = 0; j < list.size(); j++){
                    int num = list.get(j);
                    if(visited[num]){
                        continue;
                    }
                    q.add(list.get(j));
                }
            }
            
            answer++;
            
        }
        
        
        return answer;
    }
    
    
    
}