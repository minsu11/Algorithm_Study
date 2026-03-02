import java.util.*;
class Solution {
    int[] dirX = {-1,1, 0, 0};
    int[] dirY = {0,0, -1, 1};
    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        List<List<int[]>> blocks = getBlock(table, 1);
        List<List<int[]>> emptyBlocks = getBlock(game_board, 0);
        boolean[] visited = new boolean[blocks.size()];
  
        for(int i = 0; i < emptyBlocks.size(); i++){
            int emptyBlockSize = emptyBlocks.get(i).size();
            List<int[]> emptyBlock = emptyBlocks.get(i);
            for(int j = 0; j < blocks.size(); j++){
                if(visited[j]){
                    continue;
                }
                if(blocks.get(j).size() != emptyBlockSize ){
                    continue;
                }
                
                
                List<int[]> shape = blocks.get(j);
                boolean match = false;
                for(int k = 0; k < 4; k++){
                    // 매칭 되면 continue
                    if(matchBlock(emptyBlock,shape)){
                        
                        answer += shape.size();
                        visited[j] = true;
                        match = true;
                        break;
                    }
                    
                    shape = rotationBlock(shape);
                }                
                if(match){
                    break;
                }
                
            }
        }
      
        
        return answer;
    }
    
    public List<List<int[]>> getBlock(int[][] table, int target){
        int tableCol = table.length;
        int tableRow = table[0].length;
        List<List<int[]>> blocks = new ArrayList<>();

        boolean[][] visited = new boolean[tableCol][tableRow];
        Deque<int[]> q = new ArrayDeque<>();

        for(int i = 0; i < tableCol; i++){
            for(int j = 0; j < tableRow; j++){
                if(visited[i][j]){
                    continue;
                }
            
                int x = 0;
                int y = 0;
                if(table[i][j] == target){
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                    x = i;
                    y = j;
                    List<int[]> list = new ArrayList<>();
                    while(!q.isEmpty()){
                        int[] cur = q.poll();
                        int curX = cur[0];
                        int curY = cur[1];
                        list.add(new int[]{curX - x, curY - y});
                        
                        for(int k = 0; k < 4; k++){
                            int calX = curX + dirX[k];
                            int calY = curY + dirY[k];
                            
                            if(calX <0 || calX >=tableCol || calY < 0 || calY >=tableRow){
                                continue;
                            }
                            
                            if(visited[calX][calY]){
                                continue;
                            }
                            
                            if(table[calX][calY] == target){
                                q.add(new int[]{calX, calY});
                                visited[calX][calY] = true;
                            }
                        }
                        
                    }
                    list = rotationBlock(list);
                    blocks.add(list);
                }           
            }
        }
        
        
        
        return blocks;
    }
    
  
    public List<int[]> rotationBlock(List<int[]> list){
        List<int[]> result = new ArrayList<>();
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for(int[] arr: list){
            int x = -arr[0];
            int y = arr[1];
            result.add(new int[]{y, x});
            if(minX > y){
                minX = y;
            }
            if(minY > x){
                minY = x;
            }
        }
        
        for(int[] arr : result){
            arr[0] = arr[0] - minX;
            arr[1] = arr[1] - minY;
        }
        sortList(result);
        return result;
    }
    
    public void sortList(List<int[]> list){
       list.sort(
        Comparator.comparingInt((int[] a) -> a[0])
              .thenComparingInt(a -> a[1]));
    }
    
    public boolean matchBlock(List<int[]> emptyBlock, List<int[]> block){
        
        boolean result = true;
        for(int i = 0 ; i < block.size(); i++){
            int[] empty = emptyBlock.get(i);
            int[] b = block.get(i);
            
            if(empty[0] != b[0] || empty[1] != b[1]){
                result = false;
                break;
            }
        }
        
        return result;
    }
    
}