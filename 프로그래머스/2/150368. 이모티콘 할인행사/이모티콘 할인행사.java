class Solution {
    private int maxPeople = 0;
    private int maxPrice = -1;
    private int[] rate = {10,20,30,40};
    private int[] discount;
    private int[][] users;
    private int[] emoticons;
    public int[] solution(int[][] users, int[] emoticons) {
        // n명
        // 가격 이상이면 플러스 가입을 한다         
        int[] answer = {};
        this.users = users;
        this.emoticons = emoticons;
        this.discount = new int[users.length];
        dfs(0);
        return new int[]{maxPeople, maxPrice};
    }
    // 1
    public void dfs(int idx){
        if(idx == emoticons.length){
            // 여기서 계산
            evaluate();
            return;
        }
        for(int r : rate){
            discount[idx] = r;
            dfs(idx+1);
        }
        
    }
    public void evaluate(){
        // 0: 유저가 무조건 사는 할인율
        // 1: 유저가 사는 최댓값(넘으면 구독)
        int people = 0;
        int totalPrice = 0;
        for(int i = 0; i < this.users.length; i++){
            int percent = users[i][0];
            int money = users[i][1];
            int x = 0;
            for(int j = 0; j < this.discount.length; j++){
                if(discount[j] < percent){
                    continue;
                }
                x += this.emoticons[j] * (100 - discount[j])/100;
            }
            if(x < money){
                totalPrice += x;
            }else{
                people++;
            }
            
        }
        
        
        if(people > this.maxPeople){
            this.maxPeople = people;
            this.maxPrice = totalPrice;
        }else if(people == this.maxPeople && this.maxPrice < totalPrice){
            this.maxPrice = totalPrice;
        }
        
    }
}