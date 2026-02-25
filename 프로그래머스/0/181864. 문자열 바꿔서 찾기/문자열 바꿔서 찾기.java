class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toCharArray()){
            if(c == 'A'){
                c = 'B';
            }else {
                c ='A';
            }
            sb.append(String.valueOf(c));
        }
        
        return sb.toString().contains(pat) ? 1:0;
    }
}