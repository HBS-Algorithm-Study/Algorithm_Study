import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;
        int s = 1;
        
        for (int i = 1; i <= N; i++) {
            sum += i;
            for (; sum > N; s++) {
                sum -= s;
            }if (sum == N) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
