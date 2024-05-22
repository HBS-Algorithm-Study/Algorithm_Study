import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int[] s = new int[N+1];     // 배열 안 모든 요소를 0으로 초기화
        for(int i =1; i<=N; i++){   // 누적합 배열 생성
            s[i] = s[i-1] + i;
        }
        int ans = 0;
        for(int i=0; i<N; i++){     // 누적합 배열을 돌면서 s[i]+N 값이 s에 존재하는지 확인
            boolean isExist = Arrays.binarySearch(s, s[i]+N) >= 0; // N이 최대 천만 까지 가능하므로 이진탐색 적용
            if(isExist) ans++;
        }
        System.out.println(ans);
    }
}