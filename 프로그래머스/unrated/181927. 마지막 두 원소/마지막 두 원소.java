class Solution {
    public int[] solution(int[] num_list) {
        int finalIdx = num_list.length;
        int[] answer = new int[finalIdx+1];
        
        for(int i = 0; i < finalIdx; i++){
            answer[i] = num_list[i];
        }
        if(answer[finalIdx-2]< answer[finalIdx-1]){
            answer[finalIdx] = answer[finalIdx-1] - answer[finalIdx-2];
        }
        else{
            answer[finalIdx] = answer[finalIdx-1] * 2;
        }
        return answer;
    }
}