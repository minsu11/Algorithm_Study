class Solution {
    public int solution(int a, int b) {
        String sumAB = ""+a+b;
        String mulAB = ""+(2*a*b);

        return Integer.parseInt(sumAB) >= Integer.parseInt(mulAB) ? Integer.parseInt(sumAB) : Integer.parseInt(mulAB);
    }
}