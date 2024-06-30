package study_6;

import java.io.*;

public class 동전0_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] coins = new int[N];
        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for(int i=N-1; i>=0; i--){
            if(K/coins[i]<=0)
                continue;
            answer += K/coins[i];
            K %= coins[i];
        }

        System.out.println(answer);


    }
}
