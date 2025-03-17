class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        String[] str = t.split("");
        String[] pArr = p.split("");
        
        for(int i = 0; i <= str.length - pArr.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < pArr.length; j++){
               sb.append(str[i + j]);
            }
            
            if(Long.parseLong(p) >= Long.parseLong(sb.toString())){
                answer++;        
            }
        
        }
        
        return answer;
    }
}