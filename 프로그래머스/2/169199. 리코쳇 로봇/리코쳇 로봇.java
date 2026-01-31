import java.util.*;
class Solution {
    public int solution(String[] board) {
        int answer = -1;
        int row = board.length;
        int col = board[0].length();
        boolean[][] visited = new boolean[row][col];
        
        Deque<int[]> q = new ArrayDeque<>();
        // que
        // int[] 0: x 위치, 1: y위치, 2: 이동한 횟수
        for(int i = 0; i < row; i++){
            String b = board[i];
            for(int j = 0 ; j < col; j++){
                if(b.charAt(j) == 'R'){
                    q.add(new int[]{i,j,0});
                    visited[i][j] = true;
                }
            }
        }
        
        // D 벽 G 도착
        // 
        while(!q.isEmpty()){
            // 현재 위치
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            int moveCnt = cur[2];
            
            if(board[curX].charAt(curY) == 'G'){
                answer = moveCnt;
                break;
            }
            
            // 상
            int nX = curX;
            int nY = curY;

            while((nX-1 >= 0) && board[nX-1].charAt(nY) != 'D') {
                nX--;
            }
            if(!visited[nX][nY] && (nX != curX || nY != curY)){
                q.add(new int[]{nX, nY, moveCnt+1});
                visited[nX][nY] = true;
            }
            // 하
            nX = curX;
            nY = curY;
            while((nX+1 < row) && board[nX+1].charAt(nY) != 'D') {
                nX++;
            }
            if(!visited[nX][nY] && (nX != curX || nY != curY)){
                q.add(new int[]{nX, nY, moveCnt+1});
                visited[nX][nY] = true;
            }
            // 좌
            nX = curX;
            nY = curY;
            while((nY-1 >= 0) && board[nX].charAt(nY-1) != 'D') {
                nY--;
            }
            if(!visited[nX][nY] && (nX != curX || nY != curY)){
                q.add(new int[]{nX, nY, moveCnt+1});
                visited[nX][nY] = true;
            }// 우
            nX = curX;
            nY = curY;
            while((nY+1 < col) && board[nX].charAt(nY+1) != 'D') {
                nY++;
            }
            if(!visited[nX][nY] && (nX != curX || nY != curY)){
                q.add(new int[]{nX, nY, moveCnt+1});
                visited[nX][nY] = true;
            }
        }
        
        return answer;
    }
}