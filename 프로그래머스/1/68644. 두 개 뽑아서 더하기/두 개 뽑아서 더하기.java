import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        int[] answer = {};
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                result.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(result);
        Collections.sort(list);
        return list.toArray(new Integer[list.size()]);
    }
}