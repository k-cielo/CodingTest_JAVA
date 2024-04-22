class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int a = 0;
        int b = 0;
        for(int i = 0; i < numbers.length; i++){
            a = numbers[i];
            b = 2 * a;
            answer[i] = b;
        }
        return answer;
    }
}