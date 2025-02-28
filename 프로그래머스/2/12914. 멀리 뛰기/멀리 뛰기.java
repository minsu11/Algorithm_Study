class Solution {
    // 점화식 사용해서 풀어야함
    public long solution(int n) {
        if(n ==1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        long x1 = 1l;
        long x2 = 2l;
        long answer = 0;
        for(int i = 2; i < n; i++){
            answer = x1 + x2;
            x1 = x2 % 1234567;
            x2 = answer%1234567;
        }
        
        return answer%1234567;
    }
    
    
}