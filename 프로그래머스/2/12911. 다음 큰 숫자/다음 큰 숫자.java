class Solution {
    public int solution(int n) {
        int nCnt = Integer.bitCount(n);
        while(true){
            n+=1;
            if(nCnt == Integer.bitCount(n)){
                break;
            }
        }
        return n;
    }
}