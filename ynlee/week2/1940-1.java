import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String[] f_line = br.readLine().split(" ");
        int cnt = 0;

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++) {
                int sum = Integer.parseInt(f_line[i]) + Integer.parseInt(f_line[j]);
                if(sum == M){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
