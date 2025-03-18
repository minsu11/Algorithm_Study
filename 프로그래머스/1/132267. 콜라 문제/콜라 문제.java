class Solution {
    public int solution(int a, int b, int n) {
        // a: 제한, b: 빈 병 a개를 주면 마트가 주는 콜라병 수, n: 빈 병
        int answer = 0;
        int emptyCoke = n;
        
        while(emptyCoke >=a){
            int num = emptyCoke / a;
            emptyCoke = emptyCoke - (a*num) + (num * b);
            answer+=  (num * b);
            
        }
        
        
        return answer;
    }
}