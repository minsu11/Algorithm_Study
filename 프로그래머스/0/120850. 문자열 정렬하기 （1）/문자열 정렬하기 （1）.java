import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]*", "");
        int[] answer = new int[my_string.length()];
        int i = 0;
        for(char c : my_string.toCharArray()){
            answer[i] = Integer.parseInt(String.valueOf(c));
            i++;
        }
        Arrays.sort(answer);       
        return answer;
    }
}