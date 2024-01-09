class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String answerA = String.valueOf(a);
        String answerB = String.valueOf(b);
        answer = Integer.valueOf(answerA + answerB);
        int answer2 = Integer.valueOf(answerB+answerA);
        
        if(answer<answer2){
            answer = answer2;
            
        }
        
        return answer;
    }
}