class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int templar[] = new int[number];
        double sqrt = 0.0;

        // 기사단원의 숫자의 약수를 구하는 식
        for(int i =0; i<number; i++){
            sqrt = Math.sqrt(i+1);
            for(int j = 1; j <= sqrt; j++){
                if((i+1) % j == 0){ // 이 부분의 연산자 우선순위를 생각을 못했음
                    if (Math.pow(j, 2) == i+1) {
                        templar[i]++;
                    } else {
                        templar[i]+=2;
                    }
                }
            }
            System.out.println(templar[i]);
        }

        for(int i =0; i< number; i++){
            if(templar[i]> limit){
                templar[i] = power;
            }
            answer += templar[i];
        }

        return answer;
    }
}