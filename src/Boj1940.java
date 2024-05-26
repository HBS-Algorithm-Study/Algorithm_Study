import java.util.Arrays;
import java.util.Scanner;

public class Boj1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);

        int i = 0;
        int j = N-1;
        while(i<j) {
            if (S[i] + S[j] < M) i++;   // 합이 M보다 작을 시 가장 작은 수 A[i]를 증가시키기
            else if(S[i] + S[j] > M) j--;  // 합이 M보다 클 시 가장 큰 수 A[j]를 감소시키기
            else {
                count++;
                i++; j--;
            }
        }
        System.out.println(count);
    }
}
