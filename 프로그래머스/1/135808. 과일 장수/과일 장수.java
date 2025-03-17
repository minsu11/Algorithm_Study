import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // m: 한 상자에 포장된 사과 갯수
        // 낮은 점수는 p, 사과 상자의 가격은 p * m
        int answer = 0;
        Arrays.sort(score);
        int cnt = 0;
        int s = 1;
        
        for(int i = score.length-m; i>=0; i-= m){
            
            answer+= score[i] * m;
           
        }
        
        
        return answer;
    }
}