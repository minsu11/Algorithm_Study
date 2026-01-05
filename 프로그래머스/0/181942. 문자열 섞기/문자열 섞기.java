class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        char[] cStr1 = str1.toCharArray();
        char[] cStr2 = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++){
            answer.append(cStr1[i]).append(cStr2[i]);
        }
        return answer.toString();
    }
}