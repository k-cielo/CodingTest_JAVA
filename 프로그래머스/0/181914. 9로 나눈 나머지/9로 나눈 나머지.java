class Solution {
    public int solution(String number) {
        int result = 0;
        int b = 0;
        char a;
        for(int i = 0; i< number.length(); i++){
            a = number.charAt(i);
            b += Character.getNumericValue(a);

        }
        return result = b % 9;
        
        
    }
}