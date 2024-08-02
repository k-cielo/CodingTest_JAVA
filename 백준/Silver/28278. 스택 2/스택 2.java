import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
       
        Deque<Integer> stack = new ArrayDeque<>();
        
       
        int n = Integer.parseInt(br.readLine());
        
   
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            
            switch (command) {
                case 1:
                
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
               
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                    break;
                case 3:
                    
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                   
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 5:
             
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                    break;
            }
        }
   
        System.out.print(sb.toString());
    }
}
