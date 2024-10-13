
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          int x = Integer.parseInt(br.readLine());
          int y = Integer.parseInt(br.readLine());
          int result = 0;
          for(int i = 0; i <y; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            result += a*b;

          }

          if(result == x ){
              System.out.println("Yes");
          }
          else{
              System.out.println("No ");
          }




      }catch (IOException e){}
    }
}