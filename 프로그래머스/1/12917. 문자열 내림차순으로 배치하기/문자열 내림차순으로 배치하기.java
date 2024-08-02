import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        // 문자열을 char 배열로 변환
        char[] charArray = s.toCharArray();
        
        // char 배열을 래핑하여 Character 배열로 변환
        Character[] characterArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            characterArray[i] = charArray[i];
        }

        // 내림차순으로 정렬
        Arrays.sort(characterArray, Collections.reverseOrder());

        // 정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder sortedString = new StringBuilder();
        for (char c : characterArray) {
            sortedString.append(c);
        }

        return sortedString.toString();
    }
}