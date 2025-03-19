class Solution {
    public boolean solution(String s) {
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        s = s.replaceAll("[a-zA-z]", " ");
        
        
        return s.contains(" ") ? false : true;
    }
}