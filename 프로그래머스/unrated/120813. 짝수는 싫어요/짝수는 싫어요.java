class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}