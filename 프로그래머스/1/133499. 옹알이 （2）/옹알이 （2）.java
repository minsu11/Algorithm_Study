class Solution {
    static String[] memory = {"aya", "ye","woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        // 기존에 있는 걸 replace 하면은?
        // 그러면 반복된 부분을 어케 알지
        // 반복된 단어가 있는지 먼저 판별해야하나?
        for(String s : babbling){
            for(int i = 0; i < memory.length; i++){
                s=s.replace(memory[i], ""+i);
            }
            try{
                int i = Integer.parseInt(s);
                if(!s.contains("11") && !s.contains("22") && !s.contains("33") && !s.contains("00") ){
                    answer++;
                }
            }catch(NumberFormatException e){
                
            }
        }
        return answer;
    }
}