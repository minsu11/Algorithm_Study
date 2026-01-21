import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> list = new ArrayList<>();
        while(k >1){
            list.add(k);
            if(k%2 == 0){
                k/=2;
            }else{
                k = k*3 +1;
            }
        }
        list.add(1);
        int end = list.size();
        double[] arr = new double[end-1];
        int len = arr.length;
        for(int i =0; i < len;i++){
            arr[i] =  ((double)(list.get(i) + list.get(i+1)) / 2);
        }
        for(int i = 0; i <ranges.length;i++){
            int start = ranges[i][0];
            int endPoint = len + ranges[i][1];
            double sum = 0.0;
            for(int j = start; j < endPoint; j++){
                sum += arr[j];
            }
            if(start > endPoint){
                sum = -1.0;
            }
            answer[i] = sum;
        }
        
        
        return answer;
    }
}