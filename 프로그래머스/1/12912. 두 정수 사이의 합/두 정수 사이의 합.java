class Solution {
    public long solution(int a, int b) {
        if(a == b){
            return a;
        }
        long answer = 0;
        if(a<b){
            while(a<=b){
                answer +=a;
                a+=1;
            }
        }
        else{
            while(b<=a){
                answer +=b;
                b+=1;
            }
        }

        
        return answer;
    }
}