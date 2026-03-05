import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        // 겹친 부분들의 꼭짓점을 구해
        // 그런 다음에 캐릭터가 x y 좌표에서 item 좌표로 가는 최단 거리로 가면 됨
        int answer = 0;
        int row = 102;
        int col = 102;
        int[][] board = fillRectangle(rectangle,col,row);
        int[] dirX = {1,-1,0,0};
        int[] dirY = {0,0,1,-1};
        
        for(int i =0; i < rectangle.length; i++){
            int x1 = rectangle[i][0]*2;
            int y1 = rectangle[i][1]*2;
            int x2 = rectangle[i][2]*2;
            int y2 = rectangle[i][3]*2;
            
            for(int j = x1+1; j < x2; j++){
                for(int k = y1+1; k <y2; k++){
                    board[j][k] = 0;
                }
            }
        }
        
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{characterX*2, characterY*2, 0});
        boolean[][] visited = new boolean[col][row];
        visited[characterX*2][characterY*2] = true;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int value = cur[2];
            if(x == itemX*2 && y == itemY*2){
                answer = value;
                break;
            }

            for(int i =0; i < 4; i++){
                int newX = x + dirX[i];
                int newY = y + dirY[i];
                if(newX <0 || newX >=col || newY <0 || newY >=col){
                    continue;
                }
                if(visited[newX][newY]){
                    continue;
                }
                if(board[newX][newY] ==1){  
                    q.add(new int[]{newX, newY,value+1});
                    visited[newX][newY] = true;
                }
                
            }
        }
        
       
        return answer/2;
    }
    
    public int[][] fillRectangle(int[][] rectangle, int col, int row){
        int[][] board = new int[col][row];
        for(int i =0; i < rectangle.length; i++){
            int x1 = rectangle[i][0]*2;
            int y1 = rectangle[i][1]*2;
            int x2 = rectangle[i][2]*2;
            int y2 = rectangle[i][3]*2;
            
            for(int j = x1; j <= x2; j++){
                for(int k = y1; k <=y2; k++){
                    board[j][k] = 1;
                }
            }
        }
        return board;
    }
}