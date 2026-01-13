class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        int num = (e-s) % 2 == 0 ? e-s : e-s+1;
        int size = num / 2;
        char[] cArr = my_string.toCharArray();
        // s -> e
        for(int i = 0; i < size; i++){
            char tmp= cArr[s+i];
            cArr[s+i] = cArr[e-i];
            cArr[e-i] = tmp;
        }
        
        for(char c : cArr){
            answer.append(String.valueOf(c));
        }
        
        return answer.toString();
    }
}