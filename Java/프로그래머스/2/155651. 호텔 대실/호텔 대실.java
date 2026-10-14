import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        Arrays.sort(book_time, (a,b) -> a[0].compareTo(b[0]));
        List<List<int[]>> list = new ArrayList<>();
        list.add(operationTime(book_time[0][0], book_time[0][1]));
        
        
        for(int i = 1; i < book_time.length; i++){
             int start = convertIntTime(book_time[i][0]);
            int end = convertIntTime(book_time[i][1]);
            boolean check =false;
            
            for(List<int[]> l : list){
                boolean c = true;
                for(int[] arr : l){
                    if (!(end + 10 <= arr[0] || start >= arr[1])) {
                        c = false;
                    }
                }
                if(c){
                    l.add(new int[]{start,end+10});
                    check = true;
                    break;
                }
            }
            
            if(!check){
                list.add(operationTime(start, end));

            }
            
        }
        int idx = 1;
        for(List<int[]> l : list){
            System.out.print(idx + "번쨰");
            for(int[] arr : l ){
                System.out.print(arr[0] +", "+ arr[1]+ " ");
            }
            System.out.println();
        }
        
        
        return list.size();
    }
    
    private List<int[]> operationTime(String startTime, String endTime){
        int start = convertIntTime(startTime);
        int end = convertIntTime(endTime);
        return operationTime(start,end);
    }
    
    private List<int[]> operationTime(int start, int end){
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{start, end+10});
        return list; 
    }
    
    private int convertIntTime(String time){
        String[] strArr = time.split(":");
        return Integer.parseInt(strArr[0]) * 60 + Integer.parseInt(strArr[1]);
    }
}