import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int size = k < score.length ? k : score.length;
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            Collections.sort(list);
            if(i >= size){
                idx++;
            }
            answer[i] = list.get(idx);
        }
        
        return answer;
    }
}