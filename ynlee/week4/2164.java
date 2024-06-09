import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }
        
        while (deque.size() > 1) {
            deque.poll(); 
            deque.add(deque.poll()); 
        }
        
        System.out.println(deque.poll());
    }
}
