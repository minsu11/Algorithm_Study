
import java.util.Arrays;
import java.util.Scanner;

/*
 * num : 0 < num < 99
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] numbers = new int[N];
        int result =0;
        if(N <= 50){
            for(int i = 0; i < N; i++){
                numbers[i] = scan.nextInt();
                if(numbers[i] >=1000000){
                    return;
                }
            } // number < 1,000,000
            Arrays.sort(numbers);
            result = numbers[0] * numbers[N-1];
            System.out.println(result);

        }
        
        
    }
}
