
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        String n ="";
        while(scan.hasNextLine()){
            String a = scan.nextLine();
            if(a == ""){
                break;
            }
            else{
                n += a+"\n";
            }
        }
        System.out.println(n);
        
    }
}