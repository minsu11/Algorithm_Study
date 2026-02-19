import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        // 1. 정렬(col 기준으로 정렬)
        // 같으면 0번째 인덱스 값으로 내림차순
        Arrays.sort(data, (a,b) -> {if(a[col-1] != b[col-1]) return Integer.compare(a[col-1], b[col-1]);
                    return Integer.compare(b[0], a[0]);
                                   });
        
        
        for(int i = row_begin; i<= row_end; i++){
            int result = 0;
            for(int j = 0; j < data[i-1].length;j++){
                result+= data[i-1][j] % i;
            }
            
            answer = answer ^ result;
        }
       
        
        return answer;
    }
    
    
}