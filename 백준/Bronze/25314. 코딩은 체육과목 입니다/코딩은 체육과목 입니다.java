
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 컴 숫자
        StringBuilder str = new StringBuilder();
        while (num >= 0) {
            if (num >= 4) {
                str.append("long ");
            } else {
                str.append("int");
            }
            num -= 4;
        }
        System.out.println(str.toString());
    }
}