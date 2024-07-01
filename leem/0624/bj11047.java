import java.io.*;
import java.util.*;

public class bj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken());
        
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int i = N - 1;
        
         while (i >= 0) {
            if (coins[i] <= K) {
                count += K / coins[i];
                K %= coins[i];
            }
            i--;
        }
        
        System.out.println(count);
    }
}
