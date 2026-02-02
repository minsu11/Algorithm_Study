import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        // 1번에서 가장 먼 노드
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // 초기화
        for(int i = 1; i <=n; i++){
            map.put(i, new ArrayList<>());
        }
        
        for(int i = 0; i < edge.length;i++){
            List<Integer> list = map.get(edge[i][0]);
            list.add(edge[i][1]);
            List<Integer> list2 = map.get(edge[i][1]);
            list2.add(edge[i][0]);
            map.put(edge[i][0], list);
            map.put(edge[i][1], list2);
        }
        boolean[] visited = new boolean[n];
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 1});
        visited[0] = true;
        int maxFloor = -1;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int floor = cur[0];
            int node = cur[1];
            List<Integer> list = map.get(node);
            
            if(maxFloor == floor){
                answer++;
            }else if(maxFloor < floor){
                maxFloor = floor;
                answer = 1;
            }
            
            
            for(int i = 0; i < list.size(); i++){
                int num = list.get(i);
                if(!visited[num-1]){
                    visited[num-1] = true;
                    q.add(new int[]{floor+1, num });
                }
                
            }
            
        }
        
        
        return answer;
    }
}