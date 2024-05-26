import java.io.*;
import java.util.*;

public class InputExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String[] f_line = br.readLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(f_line[i]);
        }

        Arrays.sort(a);

        int cnt = 0;
        int left = 0;
        int right = N - 1;

        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == M) {
                cnt++;
                left++;
                right--;
            } else if (sum < M) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(cnt);
    }
}
