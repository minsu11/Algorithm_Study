import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            while(list.size() > 0 && list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
            }

            list.add(arr[i]);
        }
        
        int[] stk = new int[list.size()];
        for(int i = 0; i < stk.length; i++){
            stk[i] = list.get(i);
        }
        
        return stk;
    }
}