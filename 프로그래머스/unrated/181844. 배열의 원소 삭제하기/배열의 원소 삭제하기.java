class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        boolean[] check = new boolean[arr.length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    check[i] = true;
                    idx++;
                }
            }
        }
        int[] answer = new int[arr.length - idx];
        idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(!check[i]){
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}