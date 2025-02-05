class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean[] card1Check = new boolean[cards1.length+1];
        boolean[] card2Check = new boolean[cards2.length+1];
        int card = 0;       
       
        for(int j = 0; j < goal.length; j++){
            for(int i = 0; i < cards1.length; i++){
                
                if(cards1[i].equals(goal[j]) && i == 0){
                    card1Check[i] = true;
                    card++;                }
                else if(cards1[i].equals(goal[j]) && !card1Check[i-1] ){
                    return "No";
                }
                else if(cards1[i].equals(goal[j]) && card1Check[i-1]){
                    card1Check[i] = true;
                    card++;
                }
            }
        }
        for(int j = 0; j < goal.length; j++){
            for(int i = 0; i < cards2.length; i++){
                if(cards2[i].equals(goal[j]) && i ==0 ){
                    card2Check[i] = true;
                    card++;
                }
                else if(cards2[i].equals(goal[j]) && !card2Check[i-1] ){
                    return "No";
                }
                else if(cards2[i].equals(goal[j]) && card2Check[i-1]){
                    card2Check[i] = true;
                    card++;
                }

            }
        }

       
        
        
        if(card != goal.length){
            return "No";
        }
        

        return "Yes";
    }
}