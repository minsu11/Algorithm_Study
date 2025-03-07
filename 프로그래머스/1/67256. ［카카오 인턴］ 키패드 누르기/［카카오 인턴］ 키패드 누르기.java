class Solution {
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftCusor = 10;
        int rightCusor = 12 ;
        StringBuilder sb = new StringBuilder();
        // hand: 오른손, 왼손인지
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                numbers[i] = 11;
            }
            
            if(numbers[i] % 3 == 1 ){
                leftCusor = numbers[i];
                sb.append("L");
                continue;
            }
            
            else if(numbers[i] %3 == 0){
                sb.append("R");
                rightCusor = numbers[i];
                continue;
            }
            int leftAbs = Math.abs(leftCusor- numbers[i]);
            int rightAbs = Math.abs(rightCusor- numbers[i]);
            int leftDistance = (leftAbs / 3) + (leftAbs % 3);
            int rightDistance = (rightAbs / 3) + (rightAbs % 3);
            
            
            if(leftDistance <= rightDistance && hand.equals("left")){
                leftCusor = numbers[i];
                sb.append("L");
            }else if(leftDistance >= rightDistance && hand.equals("right")){
                rightCusor = numbers[i];
                sb.append("R");
            }
            else if(leftDistance < rightDistance){
                leftCusor = numbers[i];
                sb.append("L");
            }else if(leftDistance > rightDistance){
                rightCusor = numbers[i];
                sb.append("R");
            }
            
        }
        
        return sb.toString();
    }
}