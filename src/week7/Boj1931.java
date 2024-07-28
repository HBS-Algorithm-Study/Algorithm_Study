package week7;
import java.util.*;

public class Boj1931 {
    // 회의실 배정
    // Greedy
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] time = new int[N][2];

        for(int i = 0; i < N; i++) {
            time[i][0] = sc.nextInt();	// 시작
            time[i][1] = sc.nextInt();	// 종료
        }

        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]) {    //종료시간이 같을 경우 시작 시간이 빠른 순
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];   // 종료 시간이 빠른 순
        });

        int count = 0;
        int bf_end_time = 0;
        for(int i = 0; i < N; i++) {
            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if(bf_end_time <= time[i][0]) {
                bf_end_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
