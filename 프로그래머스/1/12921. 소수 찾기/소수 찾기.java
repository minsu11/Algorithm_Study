import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        for(int i = 2 ; i <=Math.sqrt(n); i++){
            if(arr[i]){
                continue;
            }   
            
            for(int j = i*i; j < arr.length; j= j+i){
                arr[j] = true;
            }
        }
        for(boolean c : arr){
            if(!c){
                answer++;
            }
        }
        return answer;
    }
}