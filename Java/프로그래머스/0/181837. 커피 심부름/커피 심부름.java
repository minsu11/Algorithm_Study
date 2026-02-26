class Solution {
    String[] menu = {"cafelatte", "americano", "anything"};
    int[] menuPrice = {5000,4500, 4500};
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < 3; j++){
                if(order[i].contains(menu[j])){
                    answer += menuPrice[j];
                    break;
                }
            }
        }
        
        return answer;
    }
}