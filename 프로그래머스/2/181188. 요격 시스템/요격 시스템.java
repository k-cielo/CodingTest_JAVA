import java.util.*;
class Solution {
     public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets,((o1, o2) -> {return o1[0]-o2[0];}));

        int s = Integer.MIN_VALUE;
        int e = Integer.MAX_VALUE;
        answer++;
        for(int[] t : targets){
            int cs = t[0];
            int ce = t[1];
            if(cs >= s && e>=ce){
                s = cs;
                e = ce;
            }
            else if(cs < e && ce >= e){

                s = cs;
            }
            else{
                
                s = cs;
                e = ce;
                answer++;
            }
        }

        return answer;
    }
}