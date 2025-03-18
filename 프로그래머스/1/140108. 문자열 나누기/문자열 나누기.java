class Solution {
    public int solution(String s) {
        if(s.length() == 1){
            return 1;
        }
        
        int answer = 0;
        int cnt = 1; // 양수: 같을 때, 음수: 다른 것
        char c = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(c == s.charAt(i)){
                cnt++;
            }else if( c != s.charAt(i)){
                cnt--;
            }
            
            if(cnt == 0 && i < s.length()-1){
                cnt =0;
                answer++;
                c = s.charAt(i+1);
            }
            else if(i == s.length() -1){
                answer++;
            }
            
        }
        return answer;
    }
}