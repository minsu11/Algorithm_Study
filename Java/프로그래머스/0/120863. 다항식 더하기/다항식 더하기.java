class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int xNum = 0;
        String[] str = polynomial.split(" \\+ ");
        
        for(String s : str){
            if(s.equals("x")){
                xNum+=1;
            }else if(s.contains("x")){
                xNum += Integer.parseInt(s.replace("x",""));
            }else {
                num += Integer.parseInt(s);
            }
        }
        if(xNum > 0){
            answer += "x";
        }
        
        if(xNum > 1 && num >0){
            answer = ""+xNum+"x + " + num;
        }else if(xNum == 1 && num >0){
            answer = "x + "+num;
        }
        else if(num > 0){
            answer = ""+num;
        }else if(xNum > 1){
            answer = xNum +answer;
        }
        
        return answer;
    }
}