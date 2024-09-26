import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            if(num <=0 || num >20000){
                return;
            }
            Map<Integer, List<String>> map = new TreeMap<>();

            for(int i = 0; i< num; i++){
                String str = br.readLine().trim();
                if(str.contains(" ")){
                    continue;
                }
                List<String> list = map.get(str.length());  
                
                
                if(list == null){
                    list = new ArrayList<>();
                }
                if(!list.contains(str) && str.length() <=50 ){
                    list.add(str);
                    map.put(str.length(), list);
                }
            }
            map.forEach((key,value)->{
                Collections.sort(value);
                value.forEach(v->{
                    System.out.println(v);
                });

            });
        }catch(IOException e){
            
        }
    }
}


    

    