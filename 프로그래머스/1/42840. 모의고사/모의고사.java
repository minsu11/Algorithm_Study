class Solution {
    int[] math1 = {1,2,3,4,5};
    int[] math2 = {2,1,2,3,2,4,2,5};
    int[] math3 = {3,3,1,1,2,2,4,4,5,5};
    public int[] solution(int[] answers) {
        int x1 = cal(answers, math1);
        int x2 = cal(answers, math2);
        int x3 = cal(answers, math3);
        int[] answer = null;        
        if(x1==x2 && x2 == x3){
            answer = new int[3];
            for(int i = 0; i < 3; i++){
                answer[i] = i +1;
            }
            return answer;
        }
        
        if(x1 < x2 && x2 == x3){
            answer = new int[2];
            answer[0] = 2;answer[1] = 3;
            
        }else if(x2 < x3 && x3 == x1){
            
            answer = new int[2];
            answer[0] = 1; answer[1] = 3;
        }else if(x3< x1 && x1 == x2){
            
            answer = new int[2];
            answer[0] = 1; answer[1] = 2;
        }else if(x2 < x1 && x3 < x1){
            answer = new int[1];answer[0] = 1;
        }else if (x1< x2 && x3 < x2){
            answer = new int[1];answer[0] = 2;
        }else if(x2 < x3 && x1 < x3){
            answer = new int[1]; answer[0] = 3;
        }
        
        return answer;
    }
    
    
    public int cal(int[] answers, int[] mathFail){
        int result = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == mathFail[i % mathFail.length]){
                result++;
            }
            
        }
        return result;
    }
}