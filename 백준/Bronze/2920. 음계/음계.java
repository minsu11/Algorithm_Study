
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           String str = br.readLine();
           if("1 2 3 4 5 6 7 8".equals(str)){
               System.out.println("ascending");
           }else if("8 7 6 5 4 3 2 1".equals(str)){
               System.out.println("descending");
           }else{
               System.out.println("mixed");
           }
        }
        catch (IOException e){

        }

    }
}
