class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String targetStr = String.valueOf(k);
        if(!numStr.contains(targetStr)){
            return -1;
        }
        int answer = 1;
        for(char c : numStr.toCharArray()){
            String s = String.valueOf(c);
            if(s.equals(targetStr)){
                break;
            }
            answer++;
        }
        return answer;
    }
}