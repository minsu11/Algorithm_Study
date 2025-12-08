class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        
        String[] strArr = my_string.split("");
        String tmp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = tmp;
        
        for(int i = 0; i < strArr.length; i++){
            answer.append(strArr[i]);
        }
    
        return answer.toString();
    }
}