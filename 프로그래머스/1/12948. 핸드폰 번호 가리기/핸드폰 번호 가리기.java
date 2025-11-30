class Solution {
    public String solution(String phone_number) {
        String[] s = phone_number.split("");
        StringBuilder sb = new StringBuilder();
        
        int idx = phone_number.length();
        
        for(int i = 0; i < idx-4; i++){
            sb.append("*");
        }
        
        for(int i = idx -4; i < idx; i++){
            sb.append(s[i]);
        }
        
        
        return sb.toString();
    }
}