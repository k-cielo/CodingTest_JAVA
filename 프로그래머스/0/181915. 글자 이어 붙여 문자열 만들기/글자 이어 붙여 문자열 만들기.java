class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] my_string_arr = my_string.split("");
        
        for(int i = 0; i < index_list.length; i++){
            answer += my_string_arr[index_list[i]];
        }
        return answer;
    }
}