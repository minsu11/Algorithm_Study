import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String expression = br.readLine();

            if(!expression.contains("-")){
                System.out.println(add(expression));
                return;
            }

            String[] strArr = expression.split("\\-");
            if(strArr[0].startsWith("0")){
                strArr[0] = parse(strArr[0]);
            }
            int result = 0;
            if(strArr[0].contains("+")){
                result = add(strArr[0]);
            }else{
                result = Integer.parseInt(strArr[0]);
            }
            
            for(int i = 1; i< strArr.length; i++){
                if(expression.contains("+")){
                    result -=add(strArr[i]);
                }else{
                    if(strArr[i].startsWith("0")){
                        strArr[i] = parse(strArr[i]);
                    }
                    result -= Integer.parseInt(strArr[i]);
                }
            }

            System.out.println(result);
            
        }catch(IOException e){

        }
    }

    public static int add(String str){
        String[] num = str.split("\\+");
        int result = 0;
        for(int i =0; i< num.length; i++){
            if(num[i].startsWith("0")){
                num[i] = parse(num[i]);
            }
            result += Integer.parseInt(num[i]);
        }

        return result;
    }

    public static String parse(String str){
        StringBuilder sb = new StringBuilder();
        char[] toCharArray = str.toCharArray();
        int cnt = 0;
        
        for(int i = 0 ; i< toCharArray.length; i++){
            if(toCharArray[i] == '0' && toCharArray[i+1] =='0'){
                cnt+=1;
            }
            else{
                break;
            }
        }
        for(int i = cnt; i < toCharArray.length; i++){
            sb.append(String.valueOf(toCharArray[i]));
        }
        return sb.toString();
    }

}
