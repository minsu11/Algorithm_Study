class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(char c : myString.toCharArray()){
            if(c < 'l'){
                c = 'l';
            }
            answer.append(String.valueOf(c));
        }
        return answer.toString();
    }
}