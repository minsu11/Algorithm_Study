import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        char[] cArr = skip.toCharArray();
        int idx = 0;
        Arrays.sort(cArr);
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            String str = String.valueOf((char)('a'+i));
            list.add(str);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(String.valueOf(cArr[idx]))){
                list.remove(i);
                idx++;
                i--;
            }
            
            if(idx == cArr.length){
                break;
            }
        }
        for(char c : s.toCharArray()){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).equals(String.valueOf(c))){
                    answer.append(list.get((i+index)% list.size()));
                    break;
                }
            }
        }
        
        return answer.toString();
    }
}