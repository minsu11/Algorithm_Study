class Solution {
    public String solution(String new_id) {
        String answer = "";
        String str = new_id.replaceAll("[~!@#$%^&*()=+\\[\\{\\]\\}:?,<>\\/]*","").replaceAll("[.]+", ".");

        if(str.startsWith(".")){            
            str = str.substring(1);
        }
        
        str = str.toLowerCase();
        
        
       
        if(str.length()> 15){
            str = str.substring(0,15);
        }
        
         if(str.endsWith(".")){            
            str = str.substring(0, str.length()-1);
        }
        
        
        
        if(str.isEmpty()){
            str = "a";
        }
        
        
        if(str.length()<3){
            String tmp = str.split("")[str.length()-1];
            for(int i = str.length(); i < 3; i++){
                str += tmp;
            }
        }
        
        
        
        answer =str;        

        return answer;
    }
}