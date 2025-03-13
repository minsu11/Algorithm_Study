import java.util.*;

class Solution {
    public long solution(int[][] dots) {
        int answer = 0;
        int minX =99999;
        int maxX = -999;
        int minY = 9999999;
        int maxY = -9999;
        for(int i = 0; i < dots.length; i++){
            if(dots[i][0] < minX){
                
                minX = dots[i][0];
                
            }
            if (maxX < dots[i][0] ){
                maxX = dots[i][0];
            }
            
            if(dots[i][1] < minY){
                minY = dots[i][1];
            }
            if(maxY < dots[i][1]){
                maxY =dots[i][1];
            }
            
        
        }
        
        
        return (maxX - minX) * (maxY - minY);
    }
}