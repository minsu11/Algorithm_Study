class Solution {
    public int[] solution(String[] wallpaper) {
       char text[][]= new char[wallpaper.length][wallpaper[0].length()];
        
        //텍스트 분류
        for(int i =0;i<wallpaper.length;i++) {
            text[i] = wallpaper[i].toCharArray();
        }
        // 시작점(lux,luy) 끈점(rdx, rdy)
        int lux= wallpaper.length, luy= wallpaper[0].length(), rdx=0, rdy =0;
        boolean first_check = false;
        // 드래그 반복문
        for(int size_x =0; size_x < wallpaper.length; size_x++){
            for(int size_y = 0; size_y<wallpaper[size_x].length(); size_y++){
                if(text[size_x][size_y] == '#'){
                    if(size_x < lux && size_y<luy){
                        lux = size_x;
                        luy = size_y;
                    }
                    if(size_x > rdx && size_y >rdy){
                        rdx = size_x; rdy = size_y;
                    }

                }
            }
        }
        int answer[] = {lux,luy,rdx,rdy};
        return answer;
    }
}