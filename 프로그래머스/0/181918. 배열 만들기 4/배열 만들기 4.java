import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stack = new int[arr.length];
        int top = 0;
        for(int i = 0; i < arr.length; i++){
            while(top > 0 &&stack[top-1]>= arr[i]){
                top--;
                
            }
            stack[top] = arr[i];
            top++;
        }
        int[] stk = new int[top];
        System.arraycopy(stack,0,stk,0,top);
        
        return stk;
    }
}