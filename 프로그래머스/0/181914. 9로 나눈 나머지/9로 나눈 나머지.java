class Solution {
    public int solution(String number) {
        int answer = 0;
        for(char c : number.toCharArray()){
            answer+= Character.digit(c,10);

        }
        
        return answer%9;
    }
}