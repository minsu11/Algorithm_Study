import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        // n 버스 시행 횟수
        // t 버스 간격
        // m 탈 수 있는 크루 인원
        String answer = "";
        Arrays.sort(timetable);
        TreeMap<String, List<String>> map = new TreeMap<>();
        int idx= 0;
        for(int i =0 ; i < n; i++){
            int hour = 9 +(t*i / 60);
            int minute = t * i % 60;
            String mStr = "";
            String hStr = "";
            if(minute < 10){
                mStr = "0";
            }
            if(hour == 9){
                hStr = "0";
            }
            String time = ""+hStr+hour+":"+mStr+minute;
            List<String> list = new ArrayList<>();
            
            for(int j = 0; j < m; j++){
                if(idx < timetable.length && timetable[idx].compareTo(time)<=0){
                    list.add(timetable[idx]);
                    idx+=1;
                }
            }
            map.put(time, list);
        }
        Map.Entry<String,List<String>> entry = map.lastEntry();
        String time = entry.getKey();
        List<String> list = entry.getValue();
        if(list.size() < m){
            return time;
        }
        String[] lastPeople = list.get(list.size()-1).split(":");
        int num = Integer.parseInt(lastPeople[0])*60 + Integer.parseInt(lastPeople[1]);
        num-=1;
        String h;
        if(num / 60 <10){
            h="0"+(num/60);
        }else {
            h = ""+(num/60);
        }
        String min;
        if(num %60 <10){
            min ="0"+ num%60;
        }
        else {
            min = ""+num % 60;
        }

        return h+":"+min;
    }
}