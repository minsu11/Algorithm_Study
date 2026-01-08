class Solution {
    // (y2-y1) * (x4 -x3) = (y4 - y3) * (x2-x1)
    public int solution(int[][] dots) {
        int answer = 0;
        for(int i = 1; i < 3; i++){
            int x1 = dots[i][0] - dots[0][0];
            int x2 = dots[3][0] - dots[3-i][0];
            int y1 = dots[i][1] - dots[0][1];
            int y2 = dots[3][1] - dots[3-i][1];
            
            if(x2*y1 == x1 * y2 ){
                System.out.println(i);
                return 1;
            }
        }

            
        if((dots[3][0] - dots[0][0]) * (dots[2][1] - dots[1][1]) == (dots[2][0] - dots[1][0]) * (dots[3][1] - dots[0][1]) ){
            answer = 1;
            System.out.println("2");
        }
        
        return answer;
    }
    

}