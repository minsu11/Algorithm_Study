class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        // N 참가자
        while(a != b){
            // A
            if( a % 2 == 1){
                a++;
            }
            a /=2;
            
            if(b % 2 == 1){
                b++;
            }
            b /=2;
            answer++;
            // B
        }
        return answer;
    }
}