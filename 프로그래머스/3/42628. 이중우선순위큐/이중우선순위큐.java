import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        List<Integer> valueList = new ArrayList<>();
        
        // String
        // 간단하게 min, max index만 하는 건
        for(int i = 0; i < operations.length; i++){
            String[] str = operations[i].split(" ");
            String operation = str[0]; // 명령문
            int value = Integer.parseInt(str[1]); // value 값 넣음
            
            // I 일 때 List에 저장
            if(operation.equals("I")){
                valueList.add(value);
                Collections.sort(valueList);
                continue;
            }
            
            if(valueList.size()==0){
                continue;
            }
            
            // value 저장일 때 continue하기 때문에 아래 구문들은 자동으로 D
            
            if(value == -1){// 최솟값 제거
                valueList.remove(0);
                continue;
            }
            // 최댓값 일 때
            valueList.remove(valueList.size()-1);            
        }
        if(valueList.size()==0){
            valueList.add(0);
            valueList.add(0);
        }
        answer[0] = valueList.get(valueList.size()-1);
        answer[1] = valueList.get(0);
        
        
        
        return answer;
    }
}