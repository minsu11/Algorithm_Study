import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer =0;
        boolean[] visited = new boolean[n+1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < edge.length; i++){
            List<Integer> list;
            if(!map.containsKey(edge[i][0])){
                list = new ArrayList<>();
            }else{
                list = map.get(edge[i][0]);
            }
            list.add(edge[i][1]);
            map.put(edge[i][0], list);
            
            if(!map.containsKey(edge[i][1])){
                list = new ArrayList<>();
            }else{
                list = map.get(edge[i][1]);
            }
            list.add(edge[i][0]);
            map.put(edge[i][1], list);
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