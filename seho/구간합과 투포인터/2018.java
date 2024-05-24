import java.util.*;
// 처음 풀이 (누적합 사용)
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
            if(isExist) ans++;                                     // 생각해보면 for문 N번 도는데 이분탐색 복잡도가 logn이므로  
        }                                                          // 시간복잡도 nlogn이 나오는데 N은 10,000,000이므로 잘못된 풀이다
        System.out.println(ans);
    }
}

// 강의 들은 후 풀이 (투 포인터 사용)
class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int sum=1;
        int s=1;
        int e=1;
        int count = 1;

        while (e!=N){
            if(sum==N){
                count++;
                e++;
                sum+=e;
            }else if(sum<N){
                e++;
                sum+=e;
            }else{
                sum-=s;
                s++;
            }
        }
        System.out.println(count);
    }
}