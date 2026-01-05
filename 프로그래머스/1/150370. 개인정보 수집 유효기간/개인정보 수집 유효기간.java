import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        // 0: 년도, 1: 달, 2: 일수
        String[] todayArr = today.split("\\.");
        int todayYear = Integer.parseInt(todayArr[0]);
        int todayMonth = Integer.parseInt(todayArr[1]);
        int todayDay = Integer.parseInt(todayArr[2]);

        for(int i = 0; i < terms.length; i++){
            String[] s = terms[i].split(" ");
            map.put(s[0] , Integer.parseInt(s[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] s = privacies[i].split(" ");
            String type = s[1];
            String[] s2 = s[0].split("\\.");
            int year = Integer.parseInt(s2[0]);
            int month = Integer.parseInt(s2[1]);
            int day = Integer.parseInt(s2[2]);
            // System.out.println("year: " +year);
            // System.out.println("month:" + month);
            // System.out.println();
            int c = (month+map.get(type)) / 12;
            
            month = (month + map.get(type)) % 12;
            
            if(month == 0){
                month = 12;
                c -=1;
            }
            System.out.println("month: "+month);
            System.out.println("today month : "+ todayMonth);
            System.out.println();
            System.out.println("day: "+day);
            System.out.println("today day : "+ todayDay);
            System.out.println();
            if(year+c > todayYear){
                continue;
            }       
            else if(year + c == todayYear && month > todayMonth){
                continue;
            }else if (year +c == todayYear && month == todayMonth && day > todayDay){
                continue;
            }
            // System.out.println(type);
            list.add(i+1);
        }
        if(list.size() ==0){
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}