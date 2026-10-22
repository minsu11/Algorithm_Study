import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer =0;
        boolean[] visited = new boolean[n+1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < edge.length; i++){
            map.computeIfAbsent(edge[i][0], k -> new ArrayList<>()).add(edge[i][1]);
            map.computeIfAbsent(edge[i][1], k -> new ArrayList<>()).add(edge[i][0]);
            
        }
        
        Deque<int[]> q = new ArrayDeque<>();
        int depth = 0;
        q.add(new int[]{1,depth});
        visited[1] = true;
        while(!q.isEmpty()){
            int[] value = q.poll();
            int d = value[1];
            List<Integer> list = map.get(value[0]);
            if(depth < d){
                depth = d;
                answer =1;
            }else if (depth == d){
                answer+=1;
            }
            
            for(Integer num : list){
                if(visited[num]){
                    continue;
                }
                q.add(new int[]{num, d+1});
                visited[num] = true;
                
            }
            
            
        }
        
        
        return answer;
    }
}