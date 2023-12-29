class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2 = 1;
        for(int num : num_list){
            answer +=num;
            answer2 *= num;
        }
        return answer2 < (answer*answer) ? 1:0 ;
    }
}