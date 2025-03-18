import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] check = {6, 6, 5,4,3,2,1};
        int[] answer = new int[2];

        int zeroNum =0;
        int cnt = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroNum++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
            }
        }
        answer[0] = check[cnt+ zeroNum];
        answer[1] = check[cnt];
        return answer;
    }
}