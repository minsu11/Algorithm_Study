
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] x = new String[n];
        char alphabet = 97;
        String s1 = "";
        int[] cnt = new int[26];
        for(int i =0; i<n;i++){
            x[i] = scan.next();
        }
        for(int index = 0; index < n; index++){
            for(int i = 0; i < 26; i++){
                if(alphabet+i == x[index].charAt(0)){
                    cnt[i]++;
                }
                
                
            }
        }
        for(int i = 0; i<26;i++){
            if(cnt[i] >=5){
                s1 += ""+(char) (97+i);
            }
        }
        if(s1 == ""){
            System.out.println("PREDAJA");
        }
        else
            System.out.println(s1);
        
        
    }
}

