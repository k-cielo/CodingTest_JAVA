import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        // 각 기능의 남은 일수를 계산하여 days 리스트에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int day = (int) Math.ceil((double) remainingWork / speeds[i]);
            days.add(day);
        }

        // 배포 일정 처리
        int deployDay = days.get(0);
        int count = 1;

        for (int i = 1; i < days.size(); i++) {
            if (days.get(i) <= deployDay) {
                count++;  // 같은 날 배포 가능하면 개수 증가
            } else {
                result.add(count);  // 배포하고 다음 기능 확인
                deployDay = days.get(i);
                count = 1;
            }
        }

        // 마지막 배포 그룹 추가
        result.add(count);

        // 결과를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = sol.solution(progresses, speeds);
        for (int num : answer) {
            System.out.print(num + " ");
        }
        // 출력: 2 1
    }
}
