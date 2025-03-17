class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] check = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < check.length; i++){
            
            for(int j = 0; j < check[0].length; j++){
                if(board[i][j] != 1){
                    continue;
                }
                check[i][j] =true;
                
                if(i+1<check.length && j +1 < check[0].length){
                    check[i+1][j+1] = true;      
                }
                if(i-1 >= 0 && j-1>=0){
                    check[i-1][j-1] = true;
                }
                
                if(i - 1 >=0 && j + 1< check[0].length){
                    check[i-1][j+1] = true;    
                }
                
                if(i+1<check.length){
                    check[i+1][j] = true;    
                }
                
                if(j+1 < check[0].length){
                    check[i][j+1] = true;
                }
                
                if(i-1 >=0){
                    check[i-1][j] = true;
                    
                }
                if(j-1 >=0){
                    check[i][j-1] =true;     
                    
                }
                if(i+1 < check.length && j -1 >=0){
                    check[i+1][j-1] = true;
                }
                
                  
                
                
            }
        }
        
        for(int i = 0; i < check.length; i++){
            for(int j = 0; j < check[0].length; j++){
                if(!check[i][j]){
                    answer++;
                }
            }
        }
    
      
        
        
        return answer;
    }
}