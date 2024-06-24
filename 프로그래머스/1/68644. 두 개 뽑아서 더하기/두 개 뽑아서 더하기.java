import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                result.add(numbers[i] + numbers[j]);
            }
        }
        
        return new ArrayList<>(result);
    }
}