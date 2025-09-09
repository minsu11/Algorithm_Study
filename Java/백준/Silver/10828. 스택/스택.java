import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
       {
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        int size = 0;

        for(int i = 0; i < num; i++){

            String line = br.readLine();

            if(line.contains("push")){ // push
                Integer number = Integer.parseInt(line.split(" ")[1]);
                list.add(number);
            }else if(line.contains("top") && size>0){

                System.out.println(list.get(size-1));
            }else if(line.contains("pop") && size>0){
                Integer popNum = list.remove(size-1);
                System.out.println(popNum);
            }else if(line.contains("size") ){
                System.out.println(size);
            }else if(line.contains("empty")){
                System.out.println(size > 0 ?  0: 1);
            }else{
                System.out.println("-1");
            }
            size = list.size();
            
        }
       }catch(IOException e){
        e.printStackTrace();
       }
        
    }

    


    
}
