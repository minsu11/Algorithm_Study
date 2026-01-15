class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int[] a = new int[26];
        for(char c : s.toCharArray()){
            int i = c - 'a';
            a[i]++;
        }
        for(int i = 0; i < 26; i++){
            if(a[i] == 1){
                char c = (char) ('a' + i);
                answer.append(String.valueOf(c));
            }
        }
        
        
        return answer.toString();
    }
}