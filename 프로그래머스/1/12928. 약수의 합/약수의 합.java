import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        int answer = 0;
        return IntStream.range(1,n+1).filter(i -> n % i ==0).sum();
    }
}