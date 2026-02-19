import java.util.*;
class Solution {
    // dfs, bfs 버전으로 풀기
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE;
        int col = maps.length;
        int row = maps[0].length;
        boolean[][] check = new boolean[col][row];
        // 종료 조건은 해당 위치에 오면 종료
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,1});
        check[0][0] = true;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int value = cur[2];
         
            if(x == col-1 && y == row-1 && value < answer){
                answer =value;
            }
            
            // 위로
            if(x > 0 && maps[x-1][y] == 1 && !check[x-1][y]){
                q.add(new int[]{x-1, y, value+1});
                check[x-1][y] = true;
            }
            if(x < col -1 && maps[x+1][y] == 1 && !check[x+1][y]){
                q.add(new int[]{x+1, y , value+1});
                check[x+1][y] = true;
            }
            if(y > 0 && maps[x][y-1] == 1 && !check[x][y-1]){
                q.add(new int[]{x,y-1,value+1});
                check[x][y-1] = true;
            }
            if(y < row-1 && maps[x][y+1] == 1 && !check[x][y+1]){
                check[x][y+1] = true;
                q.add(new int[]{x,y+1,value+1});
            }
            
            
        }
        if(answer == Integer.MAX_VALUE){
            answer = -1;
        }
        
        return answer;
    }
}