
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caseNum = scan.nextInt();
        int[] num = new int[caseNum];
        
        for(int i = 0; i<caseNum;i++){
            num[i] = scan.nextInt();
            if(num[i] >40){
                return;
            }
        }
        int ex[][] = new int [41][2];
        ex[0][0] = 1; ex[0][1]=0; // 0
        ex[1][0] = 0; ex[1][1]=1;
        ex[2][0] = 1; ex[2][1]=1;
        ex[3][0] = 1; ex[3][1]=2;
        for(int i =3;i < 41; i++){
            ex[i][0] = ex[i-1][0]+ex[i-2][0];
            ex[i][1] = ex[i-1][1]+ex[i-2][1];
        }
        for(int i =0;i<caseNum;i++){
            System.out.println(ex[num[i]][0]+ " "+ex[num[i]][1]);
        }
           
        
        
        
        
    }
}
