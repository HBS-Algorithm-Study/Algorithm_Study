import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] f_line = br.readLine().split(" ");
        int N = Integer.parseInt(f_line[0]);
        int M = Integer.parseInt(f_line[1]);

        String[] s_line = br.readLine().split(" ");

        int[] re = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            re[i] = re[i - 1] + Integer.parseInt(s_line[i - 1]);
        }

        for (int a = 0; a < M; a++) {
            String[] t_line = br.readLine().split(" ");
            int i = Integer.parseInt(t_line[0]);
            int j = Integer.parseInt(t_line[1]);
            int sum = re[j] - re[i - 1];
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
