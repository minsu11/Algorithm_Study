class Solution {
    int max = 0;
    int[][] dungeons;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        int size = dungeons.length;
        visited = new boolean[size];
        this.dungeons = dungeons;
        for(int i = 0; i < dungeons.length; i++){
            dfs(k,i,0);   
        }
        return max;
    }
    
    public void dfs(int k, int idx, int cnt){
        if(visited[idx] || dungeons[idx][0] > k){
            if(max < cnt){
                max = cnt;
            }
            return;
        }
        visited[idx] = true;
        cnt+=1;
        k -= dungeons[idx][1];
        for(int i = 0; i < this.dungeons.length; i++){
            dfs(k, i,cnt);
        }
        visited[idx] = false;
        
    }
    
  
}