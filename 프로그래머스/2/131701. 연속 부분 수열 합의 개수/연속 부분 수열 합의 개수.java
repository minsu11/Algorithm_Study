import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new LinkedHashSet<>();
        int len = elements.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int num = 0;
                for(int k =0; k <=i; k++){
                    int idx = (j+k) % len;
                    num += elements[idx];
                }
                set.add(num);
            }
        }
        answer = set.size();
        return answer;
    }
}