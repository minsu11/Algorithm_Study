class Solution {
    public int solution(int n) {
        int num = (int) Math.sqrt(n);
        if(n == num*num){
            return 1;
        }
        else{
            return 2;
        }
    }
}