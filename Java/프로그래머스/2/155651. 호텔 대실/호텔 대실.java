import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        Arrays.sort(book_time, (a,b) -> a[0].compareTo(b[0]));
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for(String[] str : book_time){
            int start = convertIntTime(str[0]);
            int end = convertIntTime(str[1]) +10;
            
            if(!rooms.isEmpty() && rooms.peek() <= start){
                rooms.poll();
            }
            rooms.add(end);
        }
        
        return rooms.size();
    }
    
    
    private int convertIntTime(String time){
        String[] strArr = time.split(":");
        return Integer.parseInt(strArr[0]) * 60 + Integer.parseInt(strArr[1]);
    }
}