import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // 주체가 되는 문자열이 다른 문자열에게서 startwith인지 이것만 확인하면 되는건가?
        Arrays.sort(phone_book);

        String str=phone_book[0];
        for(int i = 1; i <  phone_book.length; i++){
            if(phone_book[i].startsWith(str)){
                return false;
            }
            str = phone_book[i];
            
        }
        return true;
    }
}