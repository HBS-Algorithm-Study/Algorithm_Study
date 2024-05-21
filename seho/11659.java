import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();               
        int M = sc.nextInt();
        int[] num = new int[N];
        for(int i=0; i<N; i++) num[i] = sc.nextInt(); // N개의 수 입력

        int[] sum = new int[N+1];               // 초기값 0을 위해 N+1 int 배열 생성
        sum[0] = 0;                             // 초기값을 0으로 세팅
        for(int i=1; i<=N; i++){                // 누적합 배열 생성
            sum[i] = sum[i-1] + num[i-1];
        }
        
        for(int i=0; i<M; i++){                 // 범위 입력
            int s = sc.nextInt();
            int e = sc.nextInt();

        System.out.println(sum[e]-sum[s-1]);
        }
    }
}