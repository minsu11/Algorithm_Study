class Solution {
    public int solution(int[] numbers) {

        int x = 0;
        int y =0;
        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[x] < numbers[i]){
                x =i;
            }
        }
        if(x == 0){
            y = 1;
        }
        for(int i = y; i < numbers.length; i++){
            if(numbers[y] < numbers[i] && x != i){
                y = i;
            }
        }
        
        return numbers[x] * numbers[y];
    }
}