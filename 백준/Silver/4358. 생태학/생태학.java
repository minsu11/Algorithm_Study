import java.io.*;
import java.util.*;
public class Main {
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = new String();

            Map<String, Integer> map = new TreeMap<>();
            while(true){
                str = br.readLine();
                if("".equals(str) || str == null){
                    break;
                }
                if(map.containsKey(str)){
                    int num = map.get(str);
                    map.put(str, num+1);
                }else{
                    map.put(str, 1);
                }
                count +=1;
                
            }

            if(map.size() == 0){
                return;
            }

            map.forEach((key,value)->{
                double avg = ((double) value / count) * 100.0;
                
                System.out.println(String.format("%s %.4f", key,avg));

            });

           
        }catch(IOException e){
            
        }
    }
}
