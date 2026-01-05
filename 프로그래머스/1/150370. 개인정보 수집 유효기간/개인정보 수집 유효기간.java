import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        // 0: 년도, 1: 달, 2: 일수
        int todayDate = getDate(today);
        for(int i = 0; i < terms.length; i++){
            String[] s = terms[i].split(" ");
            map.put(s[0] , Integer.parseInt(s[1])*28);
        }
        
        for(int i =0; i < privacies.length; i++){
            String[] t = privacies[i].split(" ");
            String type = t[1];
            int date = getDate(t[0]);
            
            if(date + map.get(type) <= todayDate){
                list.add(i+1);
            }
        }
        
        if(list.size() == 0){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] =list.get(i);
        }
       
        return answer;
    }
    
    public int getDate(String date){
        String[] dates = date.split("\\.");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}