class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] datas = {"aya", "ye", "woo", "ma"};
        for (String str : babbling) {
            if (str.length() > 15 || str.length() < 1) {
                break;
            }
            boolean check = true;
            boolean[] dataCheck = {false, false, false, false};
            while (check) {
                int idx = 0;
                for (String data : datas) {
                    System.out.println(str);
                    if (str.startsWith(data) && !dataCheck[idx]) {
                        
                        str = str.substring(data.length(), str.length());
                    
                        check = true;
                        dataCheck[idx] = check;
                        break;
                    } else {
                        check = false;
                    }
                    idx += 1;
                }
            }
            if (str.length() == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}