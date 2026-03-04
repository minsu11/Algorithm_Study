class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[][] board = new int[11][11];
        int[] dirX = {-1,1, 0 , 0};
        int[] dirY = {0, 0, 1, -1};
        
        int x = 5;
        int y = 5;
        boolean[][][] visited = new boolean[11][11][4];
        for(char c : dirs.toCharArray()){
            int idx =0;
            int reverse= 0;
            switch(c){
                case 'U': 
                    idx = 0;
                    reverse = 1;
                    break;
                case 'D':
                    idx = 1;
                    reverse = 0;
                    break;
                case 'R':
                    idx = 2;
                    reverse = 3;
                    break;
                case 'L':
                    idx = 3;
                    reverse = 2;
                    break;
            }
            int newX = x + dirX[idx];
            int newY = y + dirY[idx];
            if(newX <0 || newX >=11 || newY <0 || newY >=11){
                continue;
            }
            if(!visited[x][y][idx]){
                answer++;
            }
            
            visited[x][y][idx] = true;
            visited[newX][newY][reverse] = true;
            x = newX;
            y = newY;
            
        }
        
        
        return answer;
    }
}