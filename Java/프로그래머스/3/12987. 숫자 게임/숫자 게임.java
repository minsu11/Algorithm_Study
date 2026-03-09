import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int idx = B.length-1;
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for(int i =A.length -1; i >= 0; i--){
            if(B[idx] > A[i]){
                idx-=1;
                answer +=1;
            }
        }
        return answer;
    }
    
    
}