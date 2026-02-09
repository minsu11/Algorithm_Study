import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int first = -1;
        int last = -1;
        for(int i = 0; i < arr.length; i++){
            if(first <0 && arr[i] == 2){
                first = i;
            }else if(first >=0 && arr[i] == 2){
                last = i;
            }
        }
        if(first < 0){
            return new int[]{-1};
        }else if(last < 0){
            return new int[]{2};
        }
        
        int[] answer = new int[last-first+1];
        for(int i = first; i<=last; i++){
            answer[i-first] = arr[i];
        }
        
        
        return answer;
    }
}