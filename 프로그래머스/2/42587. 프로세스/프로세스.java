import java.util.*;

class Solution {
    // priorities (우선 순위)
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int size = priorities.length;
        int[] arr = new int[size];
        int idx =0;
        int num = 0;
        for(int i = 0; i < size; i++){
            num = priorities[idx];
            int y = idx;
            for(int j = 0; j < size; j++){
                if(num < priorities[(y+j) % size] ){
                    num = priorities[(y+j) % size];
                    idx = (y+j) % size;
                }
            }
            arr[i] = idx;
            priorities[idx]=0;
            
            
        }
        
        for(int i = 0; i < size; i++){
            if(arr[i] == location){
                answer = i+1;
                break;
            }
        }
 
        
        return answer;
    }
}