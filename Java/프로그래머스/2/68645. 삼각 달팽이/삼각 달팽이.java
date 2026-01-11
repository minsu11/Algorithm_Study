class Solution {
    public int[] solution(int n) {
        
        int size = (n*(n+1))/2;
        int[] answer = new int[size];
        int num = 1;
        // 방향
        int direction = 3;
        // 층수
        int n1 = 0;
        int target = n;
        int cnt = 0;
        int idx = 0;
        // 0
        // 1 2
        // 3 4 5
        // 6 7 8 9
        // 10 11 12 13 14
        // 15 16 17 18 19 20
        while(num <= size){
            if(direction% 3 == 0){
                idx= idx +n1;
                n1++; // n1 = 1;
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