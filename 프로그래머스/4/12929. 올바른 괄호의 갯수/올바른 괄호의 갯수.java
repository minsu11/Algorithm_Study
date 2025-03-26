import java.util.*;
class Solution {
    public int solution(int n) {
        if(n == 1){
            return 1;
        }
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(1);
        for(int i = 2; i < n; i++){
            int num = 0;
            for(int j = 0; j < i; j++){
                num += list.get(j) *list.get(list.size()-1-j);
            }
            list.add(num);
        }
        for(int i = 0; i < n; i++){
            answer+=list.get(i) * list.get(list.size()-i-1);
        }

        return answer;
    }
}