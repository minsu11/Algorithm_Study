class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            answer += 1;
            String s = "" + answer;
            if(s.startsWith("3") &&s.length() ==2){
                    answer+=10;
            }
            else if(s.length() ==3 && s.equals("132")){
                answer+=10;
            }
            else if(s.contains("3")){
                
                answer+=1;
                if(answer % 3==0){
                    answer +=1;
                }
            }else if(answer % 3 ==0){
                answer+=1;
                String t = ""+answer;
                if(t.contains("3")){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}