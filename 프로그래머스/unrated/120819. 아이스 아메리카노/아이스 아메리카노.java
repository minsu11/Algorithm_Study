class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        for(int i = 0; ; i++){
            if(money >=5500){
                money -= 5500;
                answer[0]++;
            }
            else{
                answer[1] = money;
                money -= money;
                break;
            
            }
        }
        return answer;
    }
}