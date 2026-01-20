import java.util.*; 
class Solution {
    // lost: 도난 당한 학생
    // reserve: 여분 체육복 들고 온 학생
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = 1;
        }
        
        for(int i = 0; i < lost.length; i++){
            int lostStudent = lost[i]-1;
            arr[lostStudent]--;
        }
        for(int i = 0; i < reserve.length; i++){
            int student = reserve[i] -1 ;
            arr[student]++;
        }
       
        
        for(int cur = 0; cur < n; cur++){
            if(arr[cur] <= 1){
                continue;
            }
            int before = cur -1;
            int next = cur +1;
            
            if(cur == 0  && arr[next] ==0){
                arr[cur + 1]++;
                arr[cur]--;
            }else if(cur == n -1 && arr[before] ==0){
                arr[cur]--;
                arr[cur - 1]++;
            }else if(before >=0 && arr[before] ==0 ){
                arr[cur]--;
                arr[cur - 1]++;
            }else if(next <n && arr[next] == 0 ){
                arr[cur]--;
                arr[cur + 1]++;
            }
        }
        
        for(int num : arr){
            if(num >= 1){
                answer++;
            }
        }
        
        return answer;
    }
}