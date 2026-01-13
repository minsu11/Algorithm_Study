class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder(t);
        int num = 0;
        int turn =0;
        while(answer.length() < t){
            String s = Integer.toString(num,n).toUpperCase();
            
            for(int i = 0; i < s.length() && answer.length() <t; i++){
                if( turn % m == (p-1) ){
                    answer.append(s.charAt(i));
                }
                turn++;
            }
            
            num++;
        }
        
        return answer.toString();
    }
}