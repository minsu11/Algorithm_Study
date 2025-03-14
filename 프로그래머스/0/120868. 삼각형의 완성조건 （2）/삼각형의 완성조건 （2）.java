class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        
        answer = 2*min -1;
        return answer;
    }
}