import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = br.readLine();
            int n = Integer.parseInt(str);
            int result = 0;

            // n의 가장 작은 생성자는 max(1, n - 9 * 자릿수)부터 시작
            for(int i = Math.max(1, n - 9 * str.length()); i < n; i++){
                int sum = i;
                int temp = i;

                while(temp > 0){
                    sum += temp % 10; // 각 자리수 더하기
                    temp /= 10;
                }

                if(sum == n){
                    result = i;
                    break;
                }
            }

            System.out.println(result == 0 ? 0 : result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
