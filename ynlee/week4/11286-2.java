import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            
            if (x == 0) {
                if (deque.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    int minAbs = Integer.MAX_VALUE;
                    int minValue = 0;
                    
                    for (int val : deque) {
                        int absVal = Math.abs(val);
                        if (absVal < minAbs || (absVal == minAbs && val < minValue)) {
                            minAbs = absVal;
                            minValue = val;
                        }
                    }
                    
                    deque.remove(minValue);
                    sb.append(minValue).append('\n');
                }
            } else {
                deque.add(x);
            }
        }
        
        System.out.print(sb.toString());
    }
}
