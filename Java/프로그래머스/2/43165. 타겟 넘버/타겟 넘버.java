class Solution {
    int[] numbers;
    int cnt = 0;
    boolean[] visited;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        this.numbers = numbers;
        visited = new boolean[numbers.length];
        dfs(numbers[0], 0, target);
        dfs(-numbers[0], 0, target);
        return cnt;
    }
    
    public void dfs(int num, int idx, int target){
        if(num == target && idx == numbers.length-1){
            cnt+=1;            
            return;
        }
        if(idx == numbers.length-1){
            return;
        }
        idx+=1;
        dfs(num+numbers[idx], idx, target);
        dfs(num-numbers[idx], idx, target);
        
    }
    
}