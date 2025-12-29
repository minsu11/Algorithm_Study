class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] ex = binomial.split(" ");
        int x = Integer.parseInt(ex[0]);
        int y = Integer.parseInt(ex[2]);
        if(ex[1].equals("+")){
            answer =  x+y;
        }else if (ex[1].equals("*")){
            answer = x * y;
        }else if(ex[1].equals("-")){
            answer =x-y;
        }
        return answer;
    }
}