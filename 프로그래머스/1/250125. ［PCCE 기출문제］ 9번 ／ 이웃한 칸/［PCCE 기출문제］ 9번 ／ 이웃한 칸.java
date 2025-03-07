class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String targetColor = board[h][w]; // 같은 색인지 판별 할 색
        int[][] c = {
            {0,1},
            {0,-1},
            {1,0},
            {-1, 0}
        };
        for(int i = 0; i < 4; i++){            
            int x = c[i][0];
            int y = c[i][1];
            
            if(
                (h == 0 && x <0) || 
                (w==0 && y <0) ||
                (h + x == board.length) ||
                (w+y == board.length)
              ){
                continue;
            }
            
            String color = board[h+x][w + y];
            if(targetColor.equals(color)){
                answer+=1;
            }
        }
         
        return answer;
    }
}