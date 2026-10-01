import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        // N : 마을의 갯수
        // K: 제한 시간
        Queue<int[]> que = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        List<int[]> graph[] = new List[N+1];
        for(int i =1; i<= N; i++){
            graph[i] = new ArrayList<>(); 
        }
        
        for(int i = 0; i < road.length; i++){
            int num1 = road[i][0];
            int num2 = road[i][1];
            int value = road[i][2];
            graph[num1].add(new int[]{num2, value});
            graph[num2].add(new int[]{num1, value});
        }
        que.add(new int[]{1,0});
        
        while(!que.isEmpty()){
            int[] value = que.poll();
            int village = value[0];
            int distance = value[1];
            
            for(int i =0; i < graph[village].size(); i++){
                int[] nextValue = graph[village].get(i);
                int next = nextValue[0];
                int nextDist = nextValue[1];
                if(distance + nextDist > K){
                    continue;
                }
                if (distance > dist[village]) {
                    continue;
                }
                
                if(distance + nextDist < dist[next]){
                    dist[next]= distance + nextDist;
                    que.add(new int[]{next, dist[next] });
                }
                
            }
            
        }
        
        for(int n : dist){
            if(n <=K){
                answer+=1;
            }
        }
        return answer;
    }
}