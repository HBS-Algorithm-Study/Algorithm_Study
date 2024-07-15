// 이항계수

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        long result = binomial(n, k);

        bw.write(result + "\n");
        bw.flush();
    }

    public static long binomial(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }

        long result=1;
        for (int i= 0; i < k; i++) {
            result*=(n - i);
            result/=(i + 1);
        }
        return result;
    }
}

