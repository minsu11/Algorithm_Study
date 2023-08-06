
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int F = scan.nextInt();
        int result = 0;
        int num = 0;
        if(100 <= N && N <=2000000000 && F<=100){
            result = N - (N % 100);
            for(int i =0; i<100; i++){
                if((result+i) % F == 0){
                    num = i;
                    break;
                }
            }
            if(num <10){
                System.out.println("0"+num);
            }  
            else{
                System.out.println(""+num);
            }
        }
    }
}
