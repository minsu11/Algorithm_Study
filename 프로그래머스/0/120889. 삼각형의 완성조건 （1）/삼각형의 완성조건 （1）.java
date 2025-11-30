class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < sides.length; i++){
            if(sides[max] < sides[i]){
                // 가장 긴 변
                max = i;
            }
        }
        
        for(int i = 0; i < sides.length; i++){
            if(i != max){
                sum += sides[i];
            }
        }
        
        // 삼각형 만들 수 없음
        if(sum <= sides[max]){
            return 2;
        }
        // 삼각형 만들 수 있음
        else{
            return 1;
        }
    }
}