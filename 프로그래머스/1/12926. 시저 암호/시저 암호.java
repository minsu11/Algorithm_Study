class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String str = Character.toString(s.charAt(0));
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 97 && c <= 122 ){
                c += n;
                if( c > 122){
                    c -= 123;
                    c += 97;
                }
            }
            else if(c >= 65 && c <= 90){
                c += n;
                if( c > 90){
                    c -= 91;
                    c += 65 ;
                }
            }
            
            sb.append(Character.toString(c));
        }
        

        
        return sb.toString();
    }
}