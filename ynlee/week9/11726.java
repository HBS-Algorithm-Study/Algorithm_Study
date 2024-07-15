import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        if (n == 1) {
            bw.write("1\n");
        } else if (n == 2) {
            bw.write("2\n");
        } else {
            long a = 1;
            long b = 2;
            long temp = 0;

            for (int i = 3; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }

            bw.write(temp + "\n");
        }

        bw.flush();
    }
}
