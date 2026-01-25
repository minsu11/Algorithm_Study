import java.util.*;
class Solution {
    // + * -
    // * + -
    // * - +
    // + - *
    // - + *
    // - * +
    String op1 = 
        "+*-\n"+
        "*+-\n"+
        "*-+\n"+
        "+-*\n"+
        "-+*\n"+
        "-*+";
    
    public long solution(String expression) {
        long answer = -1;
        List<String> strArr = new ArrayList<>();
        // 숫자 저장
        List<String> numArr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c : expression.toCharArray()){
            if(c != '+' && c != '-' && c != '*'){
                sb.append(c);
            }else{
                numArr.add(sb.toString());
                sb = new StringBuilder();
                strArr.add(String.valueOf(c));
            }
        }
        numArr.add(sb.toString());
        
        // 경우의 수에 따라서 
        String opStr = calcOpCnt(expression);
        String[] sArr = opStr.split("\n");
        // 경우의 수
        for(int i = 0; i < sArr.length; i++){
            // 복사
            List<String> list = new ArrayList<>(numArr);
            List<String> list2 = new ArrayList<>(strArr);
            int result = 0;
            for(char o : sArr[i].toCharArray()){
                for(int j = 0; j < list2.size(); j++){
                    if(!list2.get(j).equals(String.valueOf(o))){
                        continue;
                    }
                    
                    long num = 0;
                    if(list2.get(j).equals("*")){
                        num = Long.parseLong(list.get(j)) * Long.parseLong(list.get(j+1));
                    }else if( list2.get(j).equals("+")){
                        num = Long.parseLong(list.get(j)) + Long.parseLong(list.get(j+1));
                    }else if(list2.get(j).equals("-")){
                        num = Long.parseLong(list.get(j)) - Long.parseLong(list.get(j+1));
                    }
                    list.set(j, ""+num);
                    list.remove(j+1);
                    list2.remove(j);
                    j--;
                }
                
            }
            
            answer = Math.max(answer, Math.abs(Long.parseLong(list.get(0))));
        }
        
        // 마지막 결과값 Math.abs로 절댓값 하기
        return answer;
    }
    
    // 경우의 수
    public String calcOpCnt(String expression){
        int cnt = 0;
        StringBuilder sb =new StringBuilder();
        if(expression.contains("+")){
            sb.append("+");
            cnt++;
        }
        if(expression.contains("-")){
            cnt++;
            sb.append("-");
        }
        if(expression.contains("*")){
            cnt++;
            sb.append("*");
        }
        if(cnt==3){
            return op1;
        }else if(cnt == 2){
            String s = sb.toString();
            sb.reverse();
            sb.append("\n").append(s);
        }
        
        
        return sb.toString();
    }
}