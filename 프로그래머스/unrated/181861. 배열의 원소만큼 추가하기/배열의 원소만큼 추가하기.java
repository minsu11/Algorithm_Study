class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        int idx = 0;
        int[] answer = new int[sum];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}