class Solution {
    public String solution(int n, int t, int m, int p) {
        // n: 진수, m: 인원, p 순서
        StringBuilder answer = new StringBuilder();
        char[] cArr = calcStr(t*m,n).toCharArray();
        int idx = p -1;
        while(answer.length() < t){
            answer.append(String.valueOf(cArr[idx]));
            idx+=m;
        }
        
        return answer.toString();
    }
    
    public String calcStr(int t, int n){
        StringBuilder sb =new StringBuilder();
        for(int i =0; i < t; i++){
            sb.append(Integer.toString(i,n).toUpperCase());
            
        }
        return sb.toString();
    }
}