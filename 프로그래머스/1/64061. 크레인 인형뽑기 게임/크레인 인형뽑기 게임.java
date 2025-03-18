import java.util.*;
class Solution {
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] moveCnt = new int[board[0].length];
        int[] basket =new int[board.length];
        int idx = 0;
        for(int i = 0; i < moveCnt.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][i] >0){
                    moveCnt[i] += 1;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < moves.length; i++){
            int move = moves[i]; // board[][moves[i]]
            int cnt = moveCnt[move-1];
            
            if(cnt == 0){
                continue;
            }
            
            int num = board[board.length - cnt][move-1] ;// 블럭의 갯수가 있음,  
            moveCnt[move-1]-= 1;
            
            list.add(num);
            
            if(list.size()>=2 && list.get(list.size()-1) == list.get(list.size()-2)){
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                
                answer+=2;
            }
        }
        
        return answer;
    }
}