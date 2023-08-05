import java.util.Scanner;

/*
 * num : 0 < num < 99
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        int count =0;
        if(0 <= answer && answer <= 99){
            int num = answer;
            

            if(0 < answer && answer < 10){ // number < 10
               
                for(;;){
                    if(num == answer && count != 0){
                        break;
                    }
                    num = ((num%10)*10) + (((num%10)+(num/10))%10);
                    count++; 
                    
                }
                System.out.println(count);
            }
    
            else{
                for(;;){
                    if(num == answer && count != 0){
                        break;
                    }
                    num = ((num%10)*10) + (((num%10)+(num/10))%10);
                    count++;
                    
                }
                System.out.println(count);
            }
        }
        
    }
}
