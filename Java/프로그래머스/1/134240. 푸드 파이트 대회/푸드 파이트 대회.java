class Solution {
    public String solution(int[] food) {
        String answer = "0";
        for(int i = food.length-1; i >=0; i--){
            int num = food[i]/2;
            String s = "";
            for(int j = 0; j < num; j++){
                s+= ""+i;
            }
            answer = s + answer + s;
        }
        return answer;
    }
}