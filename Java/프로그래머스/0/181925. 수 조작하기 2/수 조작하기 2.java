class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int firstNum = numLog[0];
        for(int i= 1; i < numLog.length; i++){
            if(firstNum + 1 == numLog[i]){
                answer.append("w");
                firstNum +=1;
            }else if(firstNum -1 == numLog[i]){
                answer.append("s");
                firstNum -=1;
            }else if(firstNum +10 == numLog[i]){
                answer.append("d");
                firstNum +=10;
            }
            else if(firstNum -10 == numLog[i]){
                firstNum -=10;
                answer.append("a");
            }
            
        }
        
        return answer.toString();
    }
}