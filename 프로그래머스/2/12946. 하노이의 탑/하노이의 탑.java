import java.util.*;
class Solution {
    int cnt=0;
    public int[][] solution(int n) {
        int p =(int) Math.pow(2,n) - 1;

        int[][] answer = new int[p][2];
        hanoi(n,1,2,3, answer);
        return answer;
    }
    
    public void hanoi(int n, int start, int sub,  int to, int[][] answer){
        
        if(n== 1){
            System.out.println(start);
            System.out.println(to);
            
            answer[cnt][0] = start;
            answer[cnt][1] = to;
            cnt++;
            return;
        }
        hanoi(n-1, start, to, sub, answer);

        answer[cnt][0] = start;
        answer[cnt][1] = to;
        cnt++;
        hanoi(n-1,sub, start, to, answer);
    }
}