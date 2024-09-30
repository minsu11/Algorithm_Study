
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int test = Integer.parseInt(br.readLine());
            int[] num1 = new int[test];
            String[] str2 = new String[test];

            for(int i = 0; i<test; i++){
                String s = br.readLine();
                num1[i] = Integer.parseInt(s.split(" ")[0]);
                str2[i] = s.split(" ")[1];
            }

            for(int i = 0; i<test; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j<str2[i].length(); j++){
                    for(int k = 0; k<num1[i]; k++){
                        sb.append(str2[i].charAt(j));
                    }
                }
                System.out.println(sb.toString());
            }

        }
        catch (IOException e){

        }

    }
}
