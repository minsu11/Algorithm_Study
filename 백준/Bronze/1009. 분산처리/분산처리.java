import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int dataA = 0;
        int dataB = 0;
        int[] n = new int[test];
        for(int i =0; i< test; i++){
            dataA = scan.nextInt(); dataB = scan.nextInt();
            n[i] =1;
            if(dataA >=1 && dataA<=100 && dataB >= 1 && dataB <=1000000){
                for(int j= 0; j<dataB; j++){
                    n[i]= (n[i] * dataA) % 10;
                
                }
            }
        }
        for(int i =0;i<test; i++){
            if(n[i] ==0){
                n[i] =10;
            }
            System.out.println(n[i]);
        }
    }
}
