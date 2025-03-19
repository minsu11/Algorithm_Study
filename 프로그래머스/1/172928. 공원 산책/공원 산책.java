class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 공원 사이즈를 벗어나거나, 장애물이 있으면 명령 무시
        int[] answer = calStartingPoint(park);
        
        for(int i = 0; i < routes.length; i++){
            String[] commands = routes[i].split(" ");
            int number = 0;
            boolean check = false;
            if(commands[0].equals("E")){
                number = Integer.parseInt(commands[1]);
                
                if(answer[1] + number>= park[0].length()){
                    continue;
                }
                
                 for(int j = answer[1]; j <= answer[1]+number; j++){
                    if(park[answer[0]].charAt(j) == 'X'){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                
                answer[1] += number;  
            }else if(commands[0].equals("S")){
                number = Integer.parseInt(commands[1]);
                
                if(answer[0] + number >= park.length ){
                    continue;
                }
                
                for(int j = answer[0]; j <= answer[0]+number; j++){
                    if(park[j].charAt(answer[1]) == 'X'){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                
                answer[0] += number;
            }else if(commands[0].equals("W")){
                number = Integer.parseInt(commands[1]);
                if(answer[1] - number <  0){
                    continue;
                }
                
                for(int j = 0; j <=number; j++){
                    if(park[answer[0]].charAt(answer[1]-j) == 'X'){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                
                answer[1] -= number;
                
            }else if(commands[0].equals("N")){
                number = Integer.parseInt(commands[1]);
                if(answer[0] - number < 0 ){
                    continue;
                }
                
                for(int j = 0; j <= number; j++){
                    if(park[answer[0]-j].charAt(answer[1]) == 'X'){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                
                
                
                answer[0] -= number;
            }
            
            
            
            
        }
        
        
        
        return answer;
    }
    
    public int[] calStartingPoint(String[] park){
        int[] answer = {0,0};
        for(int i = 0; i < park.length; i++){
            if(park[i].contains("S")){
                int idx = 0;
                while(true){
                    char c =park[i].charAt(idx);
                    if( c == 'S'){
                        answer[0]= i;
                        answer[1] = idx;
                        break;
                    }
                    idx++;
                }
            }
        }
        return answer;
    }
}