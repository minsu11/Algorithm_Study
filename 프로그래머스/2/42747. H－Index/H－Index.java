class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i = 0; i < citations.length; i++){
            for(int j = i + 1; j < citations.length ; j++){
                if(citations[i] > citations[j]){
                    int tmp = citations[i];
                    citations[i]= citations[j];
                    citations[j] = tmp;
                }
            }
        }
        int i = 0;
        while(answer < citations.length - i){
            if(citations[i] <= answer){
                i++;
            }else{
            answer++;    
            }
            
        }
        
        
        return answer;
    }
}