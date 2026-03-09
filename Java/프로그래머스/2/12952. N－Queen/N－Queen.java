class Solution {
    int answer =0;
    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;
    public int solution(int n) {
        col = new boolean[n];
        diag1 = new boolean[2*n];
        diag2 = new boolean[2*n];
        dfs(0,n);
        
        return answer;
    }
    
    public void dfs(int row, int n){
        if(n == row){
            answer++;
            return;
        }
        
        for(int c = 0; c < n; c++){
            if(col[c]) continue;
            if(diag1[row + c]) continue;
            if(diag2[row - c+n]) continue;
            
            col[c] = true;
            diag1[row+c] = true;
            diag2[row - c + n] = true;
            
            dfs(row+1, n);
            col[c] = false;
            diag1[row+c] = false;
            diag2[row - c + n] = false;
            
        }
        
    }
}