import java.math.BigInteger;
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        String m = scan.next();
        BigInteger n1 = new BigInteger(n);
        BigInteger m1 = new BigInteger(m);



        System.out.println(n1.divide(m1));
        System.out.println(n1.remainder(m1));
    }
}
