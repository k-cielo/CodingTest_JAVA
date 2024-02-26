import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String temp = "";
        
        String[] bfArray = before.split("");
        String[] afArray = after.split("");
        
        Arrays.sort(bfArray);
        Arrays.sort(afArray);
        
        for(int i=0;i<bfArray.length; i++){
          if ( !afArray[i].equals(bfArray[i])) answer = 0 ;
        
        }
        return answer;
    }
}