import java.util.*;
class Solution {
    int max = 0;
    Set<Integer> s = new HashSet<>();
    public int solution(int[][] triangle) {
        int answer = 0;
        
        answer = dfs(triangle, 0, 0,0);
        return answer;
    }
    
    public int dfs(int[][] triangle, int x, int y, int depth){
        int num =0;
        if(depth == triangle.length){
            return 0;
        }
        int n1 = 0;
        int n2 = 0;
        depth+=1;
        
        n1 = triangle[x][y] + dfs(triangle, x+1,y, depth);
        n2 = triangle[x][y] + dfs(triangle, x+1,y+1, depth);
        
        return n1 < n2 ? n2 : n1;
    }
    
}