import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] prefixSum = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + i;
        }
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int sum = prefixSum[j] - prefixSum[i - 1];
                if (sum == N) {
                    count++;
                    break;
                } else if (sum > N){
                    break;
                }
            }
        } 
        System.out.println(count + 1);
    }
}