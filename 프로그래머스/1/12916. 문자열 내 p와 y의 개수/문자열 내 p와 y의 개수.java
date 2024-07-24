class Solution {
    boolean solution(String s) {
        // 문자열을 소문자로 변환
        String lowerCase = s.toLowerCase();
        
        // p와 y의 개수를 세기 위한 변수 초기화
        int countP = 0;
        int countY = 0;
        
        // 문자열을 순회하며 p와 y의 개수를 셈
        for (int i = 0; i < lowerCase.length(); i++) {
            char ch = lowerCase.charAt(i);
            if (ch == 'p') {
                countP++;
            } else if (ch == 'y') {
                countY++;
            }
        }
        
        // p와 y의 개수를 비교하여 결과 반환
        return countP == countY;
    }
}
