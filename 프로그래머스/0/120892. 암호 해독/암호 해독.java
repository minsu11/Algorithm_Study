class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] cArr = cipher.toCharArray();
        int start = code -1;
        
        for(int i = start; i < cArr.length; i+=code){
            answer.append(String.valueOf(cArr[i]));
        }
        return answer.toString();
    }
}