class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            String s = new String();
            if(c >='A' && c <='Z'){
                s= String.valueOf(Character.toLowerCase(c));
            }else if(c >='a' && c <='z'){
                s= String.valueOf(Character.toUpperCase(c));                
            }
            answer.append(s);
        }
        
        return answer.toString();
    }
}