class Solution {
    public int solution(int price) {
        double answer = 0;
        if(price >= 100000){
            
            if(price >= 300000){
            
                if(price >= 500000){
                    answer = (double)price - ((double)price / 5);
                }
                
                else{
                    answer = (double)price - ((double)price /10);
                }
                
            }
            
            else{
                answer = (double)price - ((double)price /20);
            }
            
        }
        else{
            answer = price;
        }
        return (int)answer;
    }
}