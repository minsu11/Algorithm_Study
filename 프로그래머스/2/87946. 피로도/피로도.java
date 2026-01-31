class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int maxDungeon = dungeons.length;
        boolean[] visited = new boolean[maxDungeon];
        dfs(visited, k, dungeons, 0);
        return max;
    }
    
    // k 피로도
    public void dfs(boolean[] visited, int k, int[][] dungeons, int cnt){
        if(max< cnt){
            max = cnt;
        }
        
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i]){
                continue;
            }
            if(k < dungeons[i][0]){
                continue;
            }
            visited[i] = true;
            dfs(visited, k - dungeons[i][1], dungeons, cnt+1);

            visited[i] = false;
        }
        
    }
}