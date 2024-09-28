import java.io.*;
import java.util.*;
public class Main {
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = null;
            List<String> list = new ArrayList<>();
            String[] m = {"a","e","i","o","u"};
            while(true){
                str =br.readLine();
                if(str.equals("end")){
                    break;
                }
                list.add(str);
            }
                        
            boolean[] checkArr = new boolean[list.size()];
            int x = 0; // 자음 갯수
            int y =0 ; // 모음 갯수
            for(int i = 0; i< list.size(); i++){
                if(list.get(i).contains("a") || list.get(i).contains("e")|| list.get(i).contains("i")||list.get(i).contains("o")||list.get(i).contains("u")){
                    checkArr[i] = true;
                }
            }

            for(int i =0; i<list.size(); i++){
                char[] c = list.get(i).toCharArray();
                x=0;
                y=0;
                for(int j = 0; j < c.length; j++){
                    if(!checkArr[i]){
                        break;
                    }
                    if('a' == c[j] || 'e' == c[j] || 'i' == c[j] || 'o' == c[j] || 'u' == c[j] ){
                        y += 1;
                        x = 0;
                    }else{

                        x += 1;
                        y = 0;
                    }

                    if((x == 3 || y == 3 ) || (j < c.length-1 && (c[j] == c[j+1] && !(c[j]=='e' || c[j] == 'o'))) ){
                        checkArr[i] = false;
                        break;
                    }
                }
            }   
            for(int i = 0; i< list.size(); i++){
                if(checkArr[i]){
                    System.out.println(String.format("<%s> is acceptable.", list.get(i)));
                }else{
                    System.out.println(String.format("<%s> is not acceptable.", list.get(i)));
                }
            }


            
        }catch(IOException e){

        }
    }
}
