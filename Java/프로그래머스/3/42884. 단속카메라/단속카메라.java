import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer= 1;
        Arrays.sort(routes, (a,b) -> a[0]-b[0]);
        int end = routes[0][1];
     
        
        for(int i = 1 ; i< routes.length; i++){
            if(routes[i][0] <= end){
                end = Math.min(routes[i][1],end );
            }else{
                answer+=1;
                end = routes[i][1];
            }
            
        }
        return answer;
    }
}