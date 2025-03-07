class Solution {
    // 초깃값 45를 넣고 numbers의 값을 빼는 방법도 있었음
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];
        for(int i = 0; i < numbers.length; i++){
            check[numbers[i]] = true;
        }
        for(int i = 0; i< check.length; i++){
            if(!check[i]){
                answer += i;
            }
        }        
        return answer;
    }
}