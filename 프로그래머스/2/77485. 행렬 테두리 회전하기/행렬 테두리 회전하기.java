import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        int[][] board = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 1; j <= columns; j++){
                board[i][j-1] = (i * columns) + j;
            }
        }
        
        // 회전을 한 담에 중앙에 있는 값을 하면 되나
        for(int i = 0; i < len; i++){
            int x1 = queries[i][0]-1;
            int y1 = queries[i][1]-1;
            int x2 = queries[i][2]-1;
            int y2 = queries[i][3]-1;
            // 시작 지점 값
            int start= board[x1][y1];
            int min = board[x1][y1];
            // 가로 방향
            for(int next= y1+1; next <= y2; next++){
                int tmp = board[x1][next];
                min = Math.min(tmp,min);
                board[x1][next] = start;
                start = tmp;
            }
            
            for(int next = x1 + 1; next <= x2; next++ ){
                int tmp = board[next][y2];
                min = Math.min(tmp,min);
                board[next][y2] = start;
                start = tmp;

            }
            for(int next = y2-1; next >= y1; next-- ){
                int tmp = board[x2][next];
                min = Math.min(tmp,min);

                board[x2][next] = start;
                start = tmp;
            }
            for(int next = x2-1; next >= x1; next-- ){
                int tmp = board[next][y1];
                min = Math.min(tmp,min);
                board[next][y1] = start;
                start = tmp;
            }
            answer[i] = min;
        }
       
        
        return answer;
    }
}