class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        int cnt = 0;
        for(int i =1; i<= n; i++){
            int result = 0;
            for(int j = i; result<n; j++ ){
                result+=j;
                if(result == n){
                    cnt++;
                    break;
                }
            }
        }
        
        return cnt;
    }
}