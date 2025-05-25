import java.util.*; 

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int answer = 0;
        int weight_sum = 0;
        int len = truck_weights.length;
        int index = 0;
        Queue<Integer> on_bridge = new LinkedList<>();
        
        
        while(index < len){
            
            
            if(on_bridge.size() == bridge_length){
                weight_sum -= on_bridge.poll();
            }
           
            else if(weight_sum + truck_weights[index] > weight){
                on_bridge.offer(0);
                answer++;
            }
            else{
                on_bridge.offer(truck_weights[index]);
                weight_sum += truck_weights[index++];
                answer++;
            }
            
        }
        
        answer += bridge_length;
        return answer;
    }
}