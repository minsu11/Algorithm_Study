
import java.util.Scanner;


public class Main {
   public static int factorial(int n){
    if(n == 0 || n ==1){
        return 1;
    }
    return n * factorial(n-1);
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(factorial(N));
    }
}
