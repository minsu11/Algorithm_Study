import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        // N 마을 갯수
        // k 제한 시간
        int[][] arr = new int[N][N];
        int[] dist = new int[N];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dist, INF);
        
        for(int i = 0; i < road.length; i++){
            int x = road[i][0]-1;
            int y = road[i][1]-1;
            int value = road[i][2];
            
            if(arr[x][y] == 0 || arr[x][y] > value){
                arr[x][y] = value;
            }
            if(arr[y][x] == 0 || arr[y][x] > value){
                arr[y][x] = value;
            }
        }
        
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        q.add(new int[]{0,0});
        dist[0] = 0;
       
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int node = cur[0];
            int curDist = cur[1];
            if(curDist > dist[node]){
                continue;
            }
            for(int next = 0; next < N; next++){
                if(arr[node][next] == 0){
                    continue;
                }
                int nextDist = curDist+ arr[node][next];
                if(nextDist < dist[next] ){
                    dist[next] = nextDist;
                    q.add(new int[]{next, nextDist});
                }
            }
        }
        for(int i =0 ; i < N; i++){
            if(dist[i] <=K){
                answer++;
            }
        }
       
        
        return answer;
    }
}