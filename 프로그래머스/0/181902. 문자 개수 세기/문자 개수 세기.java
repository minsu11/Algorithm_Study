class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c : my_string.toCharArray()){
            int i = 0;
            if(c >= 'A' && c<= 'Z'){
                i = c - 'A';
            }else{
                i = c- 'a'+26;
            }
            answer[i]++;
        }
        return answer;
    }
}