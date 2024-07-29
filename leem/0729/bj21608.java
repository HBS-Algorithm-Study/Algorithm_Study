import java.util.*;

public class bj21608 {
    static int N;
    static int[][] classroom;
    static Map<Integer, Set<Integer>> map = new HashMap<>(); // 학생, 선호학생 저장 맵
    static int[] drow = {-1, 1, 0, 0};
    static int[] dcol = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        classroom = new int[N][N];
        List<Integer> seat = new ArrayList<>(); // 배치 순서

        for (int i = 0; i < N * N; i++) {
            int student = sc.nextInt();
            seat.add(student);
            Set<Integer> likeSet = new HashSet<>();
            for (int j = 0; j < 4; j++) {
                likeSet.add(sc.nextInt());
            }
            map.put(student, likeSet); // 학생번호 + 선호학생 집합 저장
        }

        for (int student : seat) {
            studentSeat(student);
        }

        int result = calculateSatisfaction();
        System.out.println(result);
    }

    static void studentSeat(int student) {
        int maxFavorites = -1; // 초기 지정기
        int maxEmpty = -1;
        int bestRow = -1;
        int bestCol = -1;

        for (int r = 0; r < N; r++) { // row
            for (int c = 0; c < N; c++) { // col
                if (classroom[r][c] != 0) continue; // 자리가 찬 경우 continue

                int count = 0;
                int emptyCount = 0;

                for (int i = 0; i < 4; i++) { // 인접 4칸 탐색
                    int nr = r + drow[i];
                    int nc = c + dcol[i];

                    if (nr >= 0 && nr < N && nc >= 0 && nc < N) { // 범위를 벗어나지 않는 경우 count 증가
                        if (map.get(student).contains(classroom[nr][nc])) {
                            count++;
                        }
                        if (classroom[nr][nc] == 0) {
                            emptyCount++;
                        }
                    }
                }

                //최적 위치 저장
                if (count > maxFavorites ||
                    (count == maxFavorites && emptyCount > maxEmpty) ||
                    (count == maxFavorites && emptyCount == maxEmpty && 
                     (bestRow == -1 || r < bestRow || (r == bestRow && c < bestCol)))) {
                    bestRow = r;
                    bestCol = c;
                    maxFavorites = count;
                    maxEmpty = emptyCount;
                }
            }
        }

        classroom[bestRow][bestCol] = student;
    }

    static int calculateSatisfaction() {
        int sumSatisfaction = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int student = classroom[r][c];
                int count = 0;

                for (int i = 0; i < 4; i++) { // 인접 4항
                    int nr = r + drow[i];
                    int nc = c + dcol[i];

                    if (nr >= 0 && nr < N && nc >= 0 && nc < N && map.get(student).contains(classroom[nr][nc])) {
                        count++; // 범위 벗어나는 여부 확인
                    }
                }
                // 만족도 계산
                if (count == 1) sumSatisfaction += 1;
                else if (count == 2) sumSatisfaction += 10;
                else if (count == 3) sumSatisfaction += 100;
                else if (count == 4) sumSatisfaction += 1000;
            }
        }
        return sumSatisfaction;
    }
}
