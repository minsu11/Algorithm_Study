import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        // 2 x 2 블럭이 되면 "" 이걸로 초기화
        // 0 0 부터 아래가 "" 이거면 내려감
        int answer = 0;
        Deque<int[]> q = new ArrayDeque<>();

        while(true){
            for(int i = 0; i < m-1; i++){
                for(int j = 0; j < n-1; j++){
                    char c = board[i].charAt(j);
                    if(
                        c >='A'&& c <='Z'&&
                        c == board[i].charAt(j+1) &&
                        c == board[i+1].charAt(j) &&
                        c == board[i+1].charAt(j+1)
                    ){
                        q.add(new int[]{i, j});
                    }          
                    
                }
            }
            if(q.isEmpty()){
                break;
            }
        
            while(!q.isEmpty()){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                
                board[x] = swap(board[x],y);
               
                board[x+1] = swap(board[x+1], y);
            }
            for(int i = 0; i < n; i++){
                int write = m-1;
                for(int j = m-1; j >=0; j--){
                    if(board[j].charAt(i) != '1'){
                        // 원래 위치의 글자
                        char c = board[j].charAt(i);
                        // 넣어야하는 곳
                        StringBuilder sb =  new StringBuilder(board[write]);
                        StringBuilder sb2 = new StringBuilder(board[j]);
                        sb2.setCharAt(i,'1');
                        board[j] = sb2.toString();
                        sb.setCharAt(i,c);
                        board[write] = sb.toString();
                        write -=1;
                    }
                    
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i].charAt(j) == '1'){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public String swap(String str, int  idx){
        StringBuilder sb =  new StringBuilder(str);
        sb.setCharAt(idx,'1');
        sb.setCharAt(idx+1,'1');
        return sb.toString();
    }
}