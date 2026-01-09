import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        String[] strArr = s.replaceAll("[{]"," ").replaceAll("[}]"," ")
            .trim().split(" , ");
        Arrays.sort(strArr,Comparator.comparingInt(String::length));
        int[] answer = new int[strArr.length];
        int idx = 0;
        for(String st : strArr){
            String[] numArr = st.split(",");
            for(String s2 : numArr){
                if(set.add(Integer.parseInt(s2))){
                    answer[idx++] = Integer.parseInt(s2);
                }
            }
        }
        
        return answer;
    }
}