class Solution {
    public int[] solution(int[] arr, int n) {
        int idx = 0;
        if(arr.length % 2 == 0 ){
            idx = 1;
        }
        
        for(; idx< arr.length; idx+=2){
                arr[idx] += n;
            }
        return arr;
    }
}