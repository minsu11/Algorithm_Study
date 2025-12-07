class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < n/2; i++){
            int num = i*i;
            if(n < num){
                return 2;
            }else if(n == num){
                return 1;
            }
        }
        
        return answer;
    }
}