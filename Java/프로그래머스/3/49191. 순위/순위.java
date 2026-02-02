import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        // 앞 사람이 이김
        int answer = 0;
        // i가 이긴 사람
        Map<Integer, List<Integer>> winMap = new HashMap<>();
        // i가 진 사람
        Map<Integer, List<Integer>> loseMap = new HashMap<>();
        
        for(int i = 1 ; i <= n; i++){
            winMap.put(i, new ArrayList<>());
            loseMap.put(i, new ArrayList<>());
        }
        
        for(int i = 0; i < results.length; i++){
            int win =results[i][0];
            int lose = results[i][1];
            List<Integer> winList = winMap.get(win);
            List<Integer> loseList = loseMap.get(lose);
            winList.add(lose);
            loseList.add(win);
            
            winMap.put(win,winList);
            loseMap.put(lose, loseList);
        }
        
        for(int i = 1; i <= n; i++){
            // 이긴 사람 bfs
            Deque<Integer> q = new ArrayDeque<>();
            boolean[] visited = new boolean[n];
            q.add(i);
            int winCnt = -1;
            while(!q.isEmpty()){
                int cur = q.poll();
                if(visited[cur-1]){
                    continue;
                }
                visited[cur-1]= true;
                List<Integer> list = winMap.get(cur);
                winCnt++;
                for(int j =0; j < list.size(); j++){
                    q.add(list.get(j));
                }
            }
            boolean[] loseVisited = new boolean[n];
            q.add(i);
            int loseCnt = -1;
            while(!q.isEmpty()){
                int cur = q.poll();
                if(loseVisited[cur-1]){
                    continue;
                }
                loseVisited[cur-1]= true;
                List<Integer> list = loseMap.get(cur);
                loseCnt++;
                for(int j =0; j < list.size(); j++){
                    q.add(list.get(j));
                }
            }
            if(winCnt + loseCnt == n-1){
                answer++;
            }            
        }
        
        return answer;
    }

}