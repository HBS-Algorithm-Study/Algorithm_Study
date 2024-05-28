import java.util.*;
// 처음 풀이 (누적합 사용)

// 이 풀이는 논리적으로는 가능하지만 백준 문제 메모리 조건을 부합하지 못하므로 틀렸습니다.
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        // n이 최대 10,000,000까지 가능한데 값이 누적되면 int범위 21억을 넘어가므로 더 큰 자료형 long을 사용해야 오류가 발생하지 않는다.
        long[] s = new long[N+1];      // 배열 안 모든 요소를 0으로 초기화
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