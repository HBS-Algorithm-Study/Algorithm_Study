import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        int current = 1;
        
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            
            while (current <= target) {
                stack.push(current++);
                sb.append("+\n");
            }
            
            if (stack.pop() != target) {
                System.out.println("NO");
                return;
            }
            sb.append("-\n");
        }
        
        System.out.print(sb.toString());
    }
}