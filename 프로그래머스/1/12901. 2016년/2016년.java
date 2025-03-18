class Solution {
    String[] days = {"THU", "FRI", "SAT","SUN","MON","TUE", "WED"  };
    int[] monthDay = {31,29,31,30,31,30,31,31,30,31,30,31};
    public String solution(int a, int b) {
        int sum = b;
        for(int i =0; i < a-1; i++){
            sum += monthDay[i];
        }
        return days[sum%7];
    }
}