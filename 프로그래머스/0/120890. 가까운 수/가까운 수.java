class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++ ){
            int num = Math.abs(n - array[i]);
            if(num < min){
                min = num;
                answer = array[i];
            }else if(num == min){
                answer = Math.min(array[i], answer);
            }
        }
        return answer;
    }
}