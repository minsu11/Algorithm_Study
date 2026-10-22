import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for(int i = triangle.length-2; i >=0; i--){
            for(int j = 0; j < triangle[i].length; j++){
                int num = triangle[i][j];
                triangle[i][j] = Math.max(num + triangle[i+1][j], num+triangle[i+1][j+1]);
            }
        }
            

        return triangle[0][0];
    }
    
    
//     public int dfs(int[][] triangle, int x, int y, int depth){
//         int num =0;
//         if(depth == triangle.length){
//             return 0;
//         }
//         int n1 = 0;
//         int n2 = 0;
//         depth+=1;

//         n1 = triangle[x][y] + dfs(triangle, x+1,y, depth);
//         n2 = triangle[x][y] + dfs(triangle, x+1,y+1, depth);
        
//         return n1 < n2 ? n2 : n1;
//     }
    
}