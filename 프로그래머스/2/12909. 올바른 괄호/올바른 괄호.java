class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        String[] arrStr = s.split("");
        for(String str : arrStr){
            if(cnt< 0){
                return false;
            }
            
            if(str.equals("(")){
                cnt++;
            }
            else{
                cnt--;
            }
        }
    
        return cnt == 0 ? true : false;
    }
}