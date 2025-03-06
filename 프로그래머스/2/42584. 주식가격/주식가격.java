class Solution {
    public int[] solution(int[] prices) {
        // 가격이 떨어진 부분만 고려하면 됨
        int[] answer = new int[prices.length]; // prices의 길이만큼 배열 선언

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    answer[i]++;
                }else {
                    answer[i]++;
                    break;
                }
            }
        }
        return answer;
    }
}