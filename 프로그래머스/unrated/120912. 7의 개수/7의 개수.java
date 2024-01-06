class Solution {
    public int solution(int[] array) {
           int answer = 0;
        for(int i=0; i<array.length; i++){
            String hangae = String.valueOf(array[i]);
            String[] arr = hangae.split("");
            
            for(int j=0; j<arr.length; j++){
                answer = arr[j].equals("7") ? ++answer : answer ;
            }
            
        }
        return answer;
    }
}