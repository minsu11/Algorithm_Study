import java.util.*;
class Solution {
    public long solution(double n) {
        int number = (int) Math.sqrt(n);
        double answer = 0;
        
        answer = Math.pow(number, 2);
        if(answer != n){
            return -1;
        }
        
        
        return (long) Math.pow(number+1,2);
    }
}