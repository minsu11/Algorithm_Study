class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 넓이
        int extent = brown + yellow;
        for(int i = 1; i * i <= extent; i++){
            int x = extent /i;
            if(extent % i == 0 && (x-2) * (i-2) == yellow){
                answer[0] = extent / i;
                answer[1] = i;
            }
        }
        return answer;
    }
}