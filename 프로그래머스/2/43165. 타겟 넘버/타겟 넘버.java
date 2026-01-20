class Solution {
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        int idx = 0;
        bfs(numbers,0, 0,target);
        
        return cnt;
    }
    
    public void bfs(int[] numbers,int idx, int sum, int target){
        if(numbers.length == idx){
            if(sum == target){
                cnt++;
            }
            return;
        }
        bfs(numbers, idx+1, sum - numbers[idx], target);
        bfs(numbers, idx+1, sum + numbers[idx], target);
        
    }
}