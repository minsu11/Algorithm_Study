import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        boolean[] visited = new boolean[y+1];
        Deque<int[]> que = new ArrayDeque<>();
        
        que.add(new int[]{x,0});
        while(!que.isEmpty()){
            int[] value = que.poll();
            int num = value[0];
            int cnt = value[1];
            if(num > y){
                continue;
            }
            
            if(num == y){
                return cnt;
            }
            if(num + n <= y && !visited[num + n]){
                que.add(new int[]{num+n,cnt +1});
                visited[num + n] = true;
            }
        
            if( num * 2 <= y && !visited[num * 2]){                
                que.add(new int[]{num*2, cnt +1 });
                visited[num * 2] = true;
            }
            
            if(num * 3 <= y && !visited[num * 3]){
                que.add(new int[]{num*3, cnt +1});
                visited[num * 3] = true;
            }
            
            
        }
        
        
        return -1;
    }
    
   
}