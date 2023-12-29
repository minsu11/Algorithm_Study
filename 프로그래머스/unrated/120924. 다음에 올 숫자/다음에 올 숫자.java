class Solution {
     public int solution(int[] common) {
        int answer = 1;
        int apCheck = 0;
        int commonRatio= common[1] - common[0];
        for(int i =0; i<common.length-1; i++){
            if(common[i+1] - common[i] == commonRatio){
                apCheck++;
            }
            else{
                break;
            }
        }

        if(apCheck ==common.length-1){ // 등차 수열
             answer = common[0] + common.length*(common[1] - common[0]);
        }

        else{ // 등비 수열
            for(int i = 0; i<common.length;i++){
                answer *= (common[1]/common[0]);
            }
            answer *= common[0];
        }

        return answer;
    }

}