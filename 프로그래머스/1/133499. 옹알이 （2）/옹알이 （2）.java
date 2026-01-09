class Solution {
    static String[] memory = {"aya", "ye","woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
      
        for(String s : babbling){
            for(int i = 0; i < memory.length; i++){
                s=s.replace(memory[i], ""+i);
            }
            
            if(!s.matches("[0-3]+")){
                continue;
            }
            
            
            if(!s.contains("11") && !s.contains("22") && !s.contains("33") && !s.contains("00") ){
                    answer++;
        }
        }
        return answer;
    }
}