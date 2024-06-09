import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] ingredients = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int cnt = 0;
        int[] buffer = new int[100001];

        for (int num : nums){
            int fin = M - num;
            if (fin > 0 && fin <= 100000 && buffer[fin] > 0) {
                cnt++;
                buffer[fin]--;
            }else{
                buffer[num]++;
            }
        }
        System.out.println(cnt);
    }
}
