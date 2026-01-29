import java.util.*;
class Solution {
    public String solution(String p) {
        String answer = "";
        boolean check = true;
        int n = 0;
        for(char c: p.toCharArray()){
            if(c == '('){
                n++;
            }else{
                n--;
                
            }
            if(n < 0){
                check = false;
                break;
            }
        }
        if(check && n == 0){
            return p;
        }
        
        answer = change(p);
        
        return answer;
    }
    
    public String change(String str){
        if(str.isEmpty()){
            return "";
        }
        int cnt = 0;
        int k = 0;
        for(char c: str.toCharArray()){
            if(c == '('){
                cnt++;
            }else {
                cnt--;
            }
            k++;
            if(cnt == 0){
                break;
            }
        }
        String u = str.substring(0,k);
        String v = str.substring(k);
        if(u.charAt(0) == '('){
            return u + change(v); 
        }
        
        return "(" + change(v) + ")" + flip(u.substring(1, u.length() - 1));
        
    }
    
    private String flip(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) == '(' ? ')' : '(');
        }
        return sb.toString();
    }
}