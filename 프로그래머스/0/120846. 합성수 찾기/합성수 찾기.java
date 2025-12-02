class Solution {
    public int solution(int n) {
        if(n < 4){
            return 0;
        }
        int answer = 3;
        
        for(int i = 4; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <i; j++){
                if(cnt >1){
                    break;
                }
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer++;
            }
        }
        
        return n-answer;
    }
}