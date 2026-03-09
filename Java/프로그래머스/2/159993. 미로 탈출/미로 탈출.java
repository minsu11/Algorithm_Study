import java.util.*;
class Solution {
    
    public int solution(String[] maps) {
        int answer = 0;
        Deque<Block> q = new ArrayDeque<>();
        char[][] cArr = new char[maps.length][maps[0].length()];
        int[] start = new int[2];
        boolean[][] visited = new boolean[cArr.length][cArr[0].length];
        boolean[][] is = new boolean[cArr.length][cArr[0].length];
        int[] dirX = {1,-1,0,0};
        int[] dirY = {0,0,1,-1};
        
        for(int i = 0; i < maps.length; i++){
            cArr[i] = maps[i].toCharArray();
            if(maps[i].contains("S")){
                for(int j = 0; j < cArr[i].length; j++){
                    if(cArr[i][j] == 'S'){
                        start[0] = i;
                        start[1] = j;
                    }
                }    
            } 
        }
        
        q.add(new Block(start[0], start[1], 0, false));
        visited[start[0]][start[1]] = true;
        
        while(!q.isEmpty()){
            Block cur = q.poll();
            int x = cur.getX();
            int y = cur.getY();
            int value = cur.getValue();
            boolean open = cur.isOpen();
            if(open && cArr[x][y] == 'E'){
                answer = value;
                break;
            }else if(!open && cArr[x][y] == 'L'){
                open = true;
            }
            
            for(int i =0; i < 4; i++){
                int newX = x + dirX[i];
                int newY = y + dirY[i];
                
                if(newX <0 || newX >= cArr.length || newY < 0 || newY >= cArr[0].length ){
                    continue;
                }
                
                if(cArr[newX][newY] == 'X'){
                    continue;
                }
                
                if(open && is[newX][newY]){
                    continue;
                }else if(!open && visited[newX][newY]){
                    continue;
                }
                
                q.add(new Block(newX, newY, value+1, open));
                if(open ){
                    is[newX][newY] = true;
                }else{
                    visited[newX][newY] = true;
                }
            }
            
        }
        
        
        
        return answer > 0 ? answer : -1;
    }
    
    class Block{
        int x;
        int y;
        int value;
        boolean open;
        public Block(int x, int y, int value, boolean open){
            this.x = x;
            this.y = y;
            this.value = value;
            this.open = open;
        }
        
        public int getX(){
            return this.x;   
        }
        public int getY(){
            return this.y;
        }
        public int getValue(){
            return this.value;
        }
        public boolean isOpen(){
            return this.open;
        }
    }
}