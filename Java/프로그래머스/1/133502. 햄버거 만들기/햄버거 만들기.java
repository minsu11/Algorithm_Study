import java.util.*;
class Solution {
    public int solution(int[] ingredient) {  
        int answer = 0;     
        int size = ingredient.length;
        int[] stack = new int[size];
        int top = -1;
        for(int i = 0; i < size;i++){
            int num = ingredient[i];
            top++;
            stack[top] = num;
            if(top >=3){
                if(stack[top-3] == 1 && stack[top-2] == 2 &&stack[top-1] == 3 &&stack[top] == 1){
                    top -=4;
                    answer++;
                }
            }
            
            
        }
        return answer;
    }
}