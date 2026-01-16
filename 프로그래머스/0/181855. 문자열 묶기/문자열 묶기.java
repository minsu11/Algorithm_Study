class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] number = new int[31];
        for(int i = 0; i < strArr.length; i++){
            int size = strArr[i].length();
            number[size]++;
        }
        
        for(int i = 0; i < number.length; i++){
            if(answer < number[i]){
                answer = number[i];
            }    
        }
        
        return answer;
    }
}