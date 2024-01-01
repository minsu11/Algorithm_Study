class Solution {
    public int solution(int[] num_list) {
        int idx = 0;
        for(int num : num_list){
            if(num <0){
                return idx;
            }
            idx++;
        }
        return -1;
    }
}