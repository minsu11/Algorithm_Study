import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(String str: s.split("")){
            list.add(str);
        }
        
        Collections.sort(list);
        for(int i = list.size()-1; i >=0; i--){
            answer.append(list.get(i));
        }
        return answer.toString();
    }
}