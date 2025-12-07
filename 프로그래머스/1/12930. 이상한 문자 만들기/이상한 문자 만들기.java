class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int idx = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' '){
                idx = 0;
                sb.append(" ");
                continue;
            }
            char x = c[i];
            if(idx % 2 == 0 && c[i] > 96 && c[i] < 123 ){
                x = (char) (x-32);
            }
            else if(idx % 2 !=0 && c[i] > 64 && c[i]< 91){
                x = (char) (x+32);
            }
            idx++;
            sb.append(String.valueOf(x));
        }
        
        
        return sb.toString();
    }
}