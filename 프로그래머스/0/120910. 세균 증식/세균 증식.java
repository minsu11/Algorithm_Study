class Solution {
    public int solution(int n, int t) {
        
        int num = (int)Math.pow(2,t);
        int answer = n * num;
        return answer;
    }
}