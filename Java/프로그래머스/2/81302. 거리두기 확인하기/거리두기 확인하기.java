class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i = 0; i < places.length; i++){
            String[] place = places[i];
            for(int j = 0; j < place.length; j++){
                int placeLen = place[i].length();
                boolean check = false;
                for(int k = 0; k < placeLen; k++){
                    if(place[j].charAt(k) == 'P'){
                        // 구현
                        // 상 하 좌 우 판별
                        if(j -1 >=0 && place[j-1].charAt(k) == 'P'){
                            answer[i] = 0;
                            check = true;
                            break;
                        }else if(j + 1 < place.length && place[j+1].charAt(k) == 'P'){
                            answer[i] = 0;
                            check = true;
                            break;
                        }else if(k - 1 >=0 && place[j].charAt(k-1) == 'P'){
                            answer[i] = 0;
                            check = true;
                            break;                            
                        }else if(k + 1 < placeLen && place[j].charAt(k+1) == 'P'){
                            answer[i] = 0;
                            check = true;
                            break;
                        }
                        
                        // 대각선 지점(안되는 경우)
                        // 왼쪽 대각선
                        if(k - 1 >=0 && j -1 >=0 && place[j-1].charAt(k-1) == 'P' 
                           && (place[j-1].charAt(k) != 'X' || place[j].charAt(k-1) != 'X')
                          ){
                            answer[i] = 0;
                            check = true;
                            break;
                        }else if( // 오른쪽 위 대각선
                            j + 1 < place.length && k+1 < placeLen && place[j+1].charAt(k+1) == 'P' &&(place[j+1].charAt(k) != 'X' || place[j].charAt(k+1) != 'X')
                        ){
                            answer[i] = 0;
                            check = true;
                            break;
                        }else if(k - 1 >=0&& j +1 <place.length && place[j+1].charAt(k-1) == 'P'
                                && (place[j+1].charAt(k) != 'X' || place[j].charAt(k-1) != 'X')
                                ){
                            answer[i] = 0;
                            check = true;
                            break;                            
                        }else if(k + 1 < placeLen && j+1 < place.length && place[j+1].charAt(k+1) == 'P' && (place[j+1].charAt(k) != 'X' || place[j].charAt(k+1) != 'X')){
                            answer[i] = 0;
                            check = true;
                            break;
                        }
                        
                        if(j -2 >=0 && place[j-2].charAt(k) == 'P' && place[j-1].charAt(k) !='X'){
                            answer[i] = 0;
                            check = true;
                            break;
                        }else if(j + 2 < place.length && place[j+2].charAt(k) == 'P' && place[j+1].charAt(k) != 'X'){
                            answer[i] = 0;
                            check = true;
                            break;
                        }else if(k - 2 >=0 && place[j].charAt(k-2) == 'P' && place[j].charAt(k-1)!='X'){
                            answer[i] = 0;
                            check = true;
                            break;                            
                        }else if(k + 2 < placeLen && place[j].charAt(k+2) == 'P' && place[j].charAt(k+1) != 'X'){
                            answer[i] = 0;
                            check = true;
                            break;
                        }
                        
                    }
                }
                if(check){
                    break;
                }else{
                    answer[i] = 1;
                }
                
            }
        }
        
        return answer;
    }
}