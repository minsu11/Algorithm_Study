import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        return  Arrays.stream(arr).map((x) -> {
            if (k % 2 == 0) {
                x += k;
            } else {
                x *= k;
            }
            return x;
        }).toArray();
    }
}