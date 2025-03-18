class Solution {
    public int solution(int n, int m, int[] section) {
        // m: 롤러의 길이, n: 벽 길이, section: 칠해야하는 부분
        int answer = 0;
        
        int start = section[0]; // 시작점
        answer++;
        int sum =0;
        for(int i = 1; i < section.length; i++){
            if(section[i] < start + m){
                continue;
            }else{
                start = section[i];
                answer++;
            }
        }
        
        
        return answer;
    }
}