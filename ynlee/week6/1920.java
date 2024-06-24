import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int m = Integer.parseInt(br.readLine());
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(a);
        
        for (int i : b) {
            sb.append(Arrays.binarySearch(a, i) >= 0 ? 1 : 0).append('\n');
        }

        System.out.print(sb.toString());
    }
}
