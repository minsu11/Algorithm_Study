class Solution {
    public String solution(String s) {
        String[] answer = s.split("");

        if(answer.length % 2==0){
            return answer[(answer.length/2) -1]+answer[answer.length/2];
        }
        return answer[answer.length/2];
    }
}