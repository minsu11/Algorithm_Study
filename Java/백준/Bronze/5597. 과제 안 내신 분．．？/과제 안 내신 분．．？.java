import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
       
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
                
                Set<Integer> resultSet = new HashSet<>();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < 28; i++){
                    resultSet.add(Integer.parseInt(br.readLine()));
                }

                for(int i = 1; i <31; i++){
                    if(!resultSet.contains(i)){
                        sb.append(i).append("\n");
                    }

                }
                bw.write(sb.toString());
                bw.flush();


        }
        

        
    }   
}   


    

    