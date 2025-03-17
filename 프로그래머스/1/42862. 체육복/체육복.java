import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n+1];
        for (int num: reserve) {
            students[num]++;
        }
        
        for (int num: lost) {
            students[num]--;
        }
        
        Arrays.sort(lost); 
        
        int lostStudent = 0;
        for (int num: lost) {
            if (students[num] >= 0) continue;
            
            if (num - 1 >= 1 && students[num-1] > 0) {
                students[num-1]--;
                continue;
            }
            if (num + 1 <= n && students[num+1] > 0) {
                students[num+1]--;
                continue;
            }
            lostStudent++;
        }
        
        int answer = n - lostStudent;
        return answer;
    }
}