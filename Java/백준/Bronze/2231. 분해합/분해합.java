
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str = br.readLine();
        int n = Integer.parseInt(str);
        for(int i = Math.max(1,n-9 *str.length()); i <n; i++ ){
            int z = i;
            int result = i;
            while(z != 0){
                result += z % 10;
                z /= 10;
            }
            if(result == n){
                System.out.println(i);
                return;
            }
        }
          System.out.println("0");

      }catch (IOException e){}
    }
}