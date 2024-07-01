package A7이분탐색;

import java.io.*;
import java.util.Arrays;

public class 먹을_7759 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int count = 0;
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            int[] arrA = new int[N];
            String[] strArrA = br.readLine().split(" ");
            int[] arrB = new int[M];
            String[] strArrB = br.readLine().split(" ");
            for (int a = 0; a < N; a++) {
                arrA[a] = Integer.parseInt(strArrA[a]);
            }
            for (int b = 0; b < M; b++) {
                arrB[b] = Integer.parseInt(strArrB[b]);
            }

            Arrays.sort(arrB);

            for (int j = 0; j < N; j++) { // 배열 A의 각 요소를
                int start = 0;
                int end = M - 1;

                int target = arrA[j];

                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (arrB[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }

                count += start; // start가 target보다 작은 요소의 개수
            }
            sb.append(count + "\n");
        }

        System.out.println(sb.toString());
    }
}
