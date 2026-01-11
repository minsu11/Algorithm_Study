class Solution {
    public int[] solution(int n) {
        int size = (n*(n+1))/2;
        int[] answer = new int[size];
        int num = 1;
        int direction = 3;
        int n1 = 0;
        int target = n;
        int cnt = 0;
        int idx = 0;
       
        while(num <= size){
            if(direction% 3 == 0){
                idx= idx +n1;
                n1++;
            }else if(direction % 3== 1){
                idx++;
            }else if(direction % 3 ==2){
                idx = idx - n1;
                n1--;
            }
            answer[idx] = num++;
            cnt++;
            if(cnt == target ){
                direction++;
                cnt = 0;
                target--;
            }
        }
        
        
        return answer;
    }
}