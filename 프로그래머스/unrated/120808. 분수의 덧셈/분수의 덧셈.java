class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int[] answer = {denom1*numer2 + denom2*numer1, denom1*denom2};
        int num1 = answer[0], num2 = answer[1];
        while(num1 % num2 !=0){
            int tmp = num1;
            num1 = num2;
            num2 = tmp % num1;
        }
        answer[0] = answer[0]/num2;
        answer[1] = answer[1]/num2;
        return answer;
    }
}