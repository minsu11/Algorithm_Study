class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 97 && c <= 122 ){
                c = (char) (((c - 'a' +n) % 26) +'a');
            }
            else if(c >= 65 && c <= 90){
                c = (char)(((c - 'A' + n) % 26) + 'A');
                
            }
            
            sb.append(Character.toString(c));
        }
        

        
        return sb.toString();
    }
}