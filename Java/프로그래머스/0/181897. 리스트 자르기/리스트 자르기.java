import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0;
        int last = num_list.length-1;
        int num = 1;
        if(n == 1){
            last = slicer[1];
        }else if(n == 2){
            start = slicer[0];
        }else if(n == 3){
            start = slicer[0];
            last = slicer[1];
        }else if(n == 4){
            start = slicer[0];
            last = slicer[1];
            num = slicer[2];
        }
        List<Integer> list = new ArrayList<>();
        
        for(int i = start; i <= last; i+=num){
            list.add(num_list[i]);
        }
        
        
        int[] answer = new int[list.size()];
        for(int i =0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}