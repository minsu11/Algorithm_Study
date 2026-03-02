import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        // n : 갯수
        if(n > s){
            return new int[]{-1};
        }
        int[] answer = new int[n];
        int num = s;
        int op = n;
        for(int i = 0; i < n;i++){
            answer[i] = num/op;
            num -= num/op;
            op-=1;
            
        }
        
        return answer;
    }
}