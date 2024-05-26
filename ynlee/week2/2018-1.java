import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=1;i<=N;i++){
            int sum = 0;
            for( int j=i;j<=N;j++){
                sum+=j;
                if(sum == N){
                    cnt ++;
                    break;
                }else if(sum>N){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
