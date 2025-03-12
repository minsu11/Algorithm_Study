class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 10000; // 시작점
        int luy = 10000;
        
        int rdx = 0;
        int rdy = 0; // 끝 부분
        String[][] strArr = new String[wallpaper.length][wallpaper[0].length()];
        
        for(int i = 0; i < wallpaper.length; i++){
            strArr[i] = wallpaper[i].split("");
        }
        
        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < strArr[i].length; j++){
                if(strArr[i][j].equals(".")){
                    continue;
                }
                // #인 경우만 나믐
                if(i < lux){
                    lux = i;
                }
                
                if(rdx < i+1){
                    rdx = i+1;
                }
                
                if(j < luy){
                    luy =j;
                }
                
                if(rdy < j+1){
                    rdy = j+1;
                }
            }
        }
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        
        return answer;
    }
}