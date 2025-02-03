import java.util.*;
import java.math.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // command 입력한 크기에 맞춘 배열 선언
        
        
        for(int i = 0; i < commands.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = commands[i][0]-1 ; j <= commands[i][1]-1; j++ ){
                list.add(array[j]);
            }
            list.sort(Integer::compareTo);
            answer[i] = list.get(commands[i][2]-1);
        }
        return answer;
    }
}