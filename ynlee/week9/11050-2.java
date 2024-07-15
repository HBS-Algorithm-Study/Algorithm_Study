import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        long[][] p = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    p[i][j] = 1;
                } else {
                    p[i][j] = p[i-1][j-1] + p[i-1][j];
                }
            }
        }

        long result = p[n][k];
        bw.write(result + "\n");
        bw.flush();

    }
}
