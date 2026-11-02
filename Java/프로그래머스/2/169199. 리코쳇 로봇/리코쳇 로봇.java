import java.util.*;
class Solution {
    public int solution(String[] board) {
        int answer = -1;
        Deque<int[]> dq = new ArrayDeque<>();
        String[][] boards = new String[board.length][board[0].length()];
        boolean[][] visited = new boolean[boards.length][boards[0].length];
        
        for(int i = 0; i < board.length; i++){
            String[] b = board[i].split("");
            for(int j = 0; j < b.length; j++){
                boards[i][j] = b[j];
                if(b[j].equals("R")){
                    dq.add(new int[]{i,j, 0});
                    visited[i][j]= true;
                }
            }
        }
        int[] dirX = {1,0,-1,0};
        int[] dirY = {0,1,0,-1};
        
        while(!dq.isEmpty()){
            int[] value = dq.poll();
            int x = value[0];
            int y = value[1];
            int dir = value[2];
            if(boards[x][y].equals("G")){
                return dir;
            }
            
            for(int i = 0; i < 4; i++){
                int curX = x;
                int curY = y;
                boolean check = false;
                while(curX  >=0 &&
                      curX < boards.length &&
                      curY  >= 0 && 
                      curY < boards[0].length ){
                    if(curX+dirX[i] < 0 || curX + dirX[i] >= boards.length ||
                      curY+dirY[i] < 0 || curY + dirY[i] >= boards[0].length
                      ){
                         if(!visited[curX][curY]){
                            
                            dq.add(new int[]{curX, curY, dir+1});
                            visited[curX][curY] = true;
                        }
                        break;
                        
                    }
                    
                    
                    if( 
                        curX + dirX[i] >=0 && curX + dirX[i] < boards.length &&
                        curY + dirY[i] >= 0 && curY + dirY[i] < boards[0].length && 
                        boards[curX+dirX[i]][curY + dirY[i]].equals("D")
                    
                    ){
                        if(!visited[curX][curY]){
                            
                            dq.add(new int[]{curX, curY, dir+1});
                            visited[curX][curY] = true;
                        }
                        
                        break;
                    }
                    curX +=dirX[i];
                    curY +=dirY[i];
                    
                    
                }
                
            }
            
            
            
        }
        
        
        
        
        return answer;
    }
}