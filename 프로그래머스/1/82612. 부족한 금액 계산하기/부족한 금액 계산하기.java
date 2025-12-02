class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        for(int i =1; i<= count; i++){
            totalPrice += price*i;
        }
        long answer = totalPrice - money;
        return answer  < 0 ? 0 : answer;
    }
}