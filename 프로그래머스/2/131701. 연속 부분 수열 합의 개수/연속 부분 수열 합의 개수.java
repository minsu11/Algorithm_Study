import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new LinkedHashSet<>();
        int len = elements.length;
        int[] dp = new int[len];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int idx = (j+i) % len;
                dp[j] += elements[idx];
                set.add(dp[j]);
            }
        }
        answer = set.size();
        return answer;
    }
}