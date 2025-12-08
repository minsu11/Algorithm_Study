import java.util.Arrays;
class Solution {
    public int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;
        int idx = x < y ? y: x;
        
        int[][] answer = new int[idx][idx];
        for(int i = 0; i < x; i++){
            answer[i] = Arrays.copyOf(arr[i],idx);
        }
        
        
        
        return answer;
    }
}