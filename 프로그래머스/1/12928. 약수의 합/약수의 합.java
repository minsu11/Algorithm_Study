import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
       // return IntStream.range(1,n+1).filter(i -> n % i ==0).sum();
        int answer = 0;
        for(int i = 1; i<=n/2;i++){
            if(n%i==0){
                answer += i;
            }
        }
        return answer+n;
    }
}