import java.util.*;

class Solution {
    
    public int[] solution(int m, int n, int[][] picture) {
        int area = 0;
        int maxArea = 0;
        int[] directionX = {-1,1,0,0};
        int[] directionY = {0,0,1, -1};
        boolean[][] visited = new boolean[m][n];
    
        
        List<List<int[]>> areaList = new ArrayList<>();
        Deque<int[]> q = new ArrayDeque<>();
        
        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                // 방문 했으면 건너뛰기
                if(visited[i][j]){
                    continue;
                }
                // 목표 숫자
                int targetNum = picture[i][j];
                if(targetNum == 0){
                    continue;
                }
                List<int[]> list = new ArrayList<>();
                list.add(new int[]{i,j});
                q.add(new int[]{i,j});
                visited[i][j] = true;
                
                while(!q.isEmpty()){
                    int[] cur = q.poll();
                    int x = cur[0];
                    int y = cur[1];
                    
                    for(int next = 0; next < 4; next++){
                        int nextX = x + directionX[next];
                        int nextY = y + directionY[next];
                        if(nextX < 0 || nextX >= m || nextY < 0 || nextY >= n){
                            continue;
                        }
                        if(visited[nextX][nextY]) continue;
                        
                        if(targetNum == picture[nextX][nextY]){
                            q.add(new int[]{nextX,nextY});
                            visited[nextX][nextY] = true;
                            list.add(new int[]{nextX,nextY});
                            
                        }
                        
                    }
                    
                }
                areaList.add(list);
                if(maxArea < list.size()){
                    maxArea = list.size();
                }
            }
        }   
        
      
        return new int[]{areaList.size(), maxArea};
    }
    
    
}