import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder str = new StringBuilder();
        for(char c:a.toCharArray()){
            if(c>='a' && c<='z'){
                str.append(Character.toString(c-32));
            }else{
                str.append(Character.toString(c+32));
            }
        }
        System.out.println(str);
    }
}