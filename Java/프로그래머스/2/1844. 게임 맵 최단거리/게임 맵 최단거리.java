import java.util.*;
class Solution {
//     // dfs, bfs 버전으로 풀기
//     public int solution(int[][] maps) {
//         int row = maps.length;
//         int col = maps[0].length;
//         boolean[][] check = new boolean[row][col];
//         // 종료 조건은 해당 위치에 오면 종료
//         Deque<int[]> q = new ArrayDeque<>();
//         q.add(new int[]{0,0,1});
//         check[0][0] = true;
//         while(!q.isEmpty()){
//             int[] cur = q.poll();
//             int x = cur[0];
//             int y = cur[1];
//             int value = cur[2];
         
//             if(x == row-1 && y == col-1 ){
//                 return value;
//             }
            
//             // 위로
//             if(x > 0 && maps[x-1][y] == 1 && !check[x-1][y]){
//                 q.add(new int[]{x-1, y, value+1});
//                 check[x-1][y] = true;
//             }
//             if(x < col -1 && maps[x+1][y] == 1 && !check[x+1][y]){
//                 q.add(new int[]{x+1, y , value+1});
//                 check[x+1][y] = true;
//             }
//             if(y > 0 && maps[x][y-1] == 1 && !check[x][y-1]){
//                 q.add(new int[]{x,y-1,value+1});
//                 check[x][y-1] = true;
//             }
//             if(y < row-1 && maps[x][y+1] == 1 && !check[x][y+1]){
//                 check[x][y+1] = true;
//                 q.add(new int[]{x,y+1,value+1});
//             }
            
            
//         }
//         return -1;
//     }
    
    public int solution(int[][] maps) {
    
        int[] value = {0,0,1};
        
        int c = maps.length-1;
        
        int r = maps[0].length-1;
        boolean[][] check = new boolean[c+1][r+1];
        
        Deque<int[]> que = new ArrayDeque<>();
        
        que.add(value);
        check[0][0] = true;
        
        while(!que.isEmpty()){
            int[] f = que.poll();
            int col = f[0];
            int row = f[1];
            int count = f[2];
            if(col == c && row == r){
                return count;
            }
            
            // 상
            if(col-1 >= 0&& !check[col-1][row] && maps[col-1][row] == 1){
                que.add(new int[]{col-1, row, count+1});
                check[col-1][row] = true;

            }
            // 하
            if(col+1 <= c && maps[col+1][row] == 1 && !check[col+1][row]){
                que.add(new int[]{col+1, row, count+1});
                check[col+1][row] = true;
            }
            // 좌
            if(row-1 >= 0 && maps[col][row-1] == 1 && !check[col][row-1]){
                que.add(new int[]{col, row-1, count+1});
                check[col][row-1] = true;

            }
            // 우
            if(row + 1 <= r  && maps[col][row+1] == 1 && !check[col][row+1]){
                que.add(new int[]{col, row+1, count+1});
                check[col][row+1] = true;

            }
        }
        
        
        
        return -1;
    }
}