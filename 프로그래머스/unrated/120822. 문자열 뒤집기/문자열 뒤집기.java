class Solution {
    public String solution(String my_string) {
        String answer = "";
        String ex[] = my_string.split("");
        for(int i = my_string.length() - 1; i >=0; i--){
            answer = answer.concat(ex[i]);
        }
        return answer;
    }
}