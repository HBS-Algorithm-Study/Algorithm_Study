package week7;
import java.io.*;
import java.util.*;

public class Boj1012 {
    // 유기농 배추 키우기
        // BFS

    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visit;
    static int count;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int c = 0; c < T; c++) {   // T = 테스트 케이스의 수
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());   // 가로 길이
            N = Integer.parseInt(st.nextToken());   // 세로 길이
            K = Integer.parseInt(st.nextToken());   // 배추 위치의 개수
            cabbage = new int[M][N];
            visit = new boolean[M][N];
            count = 0;

            // 배추 위치 입력 받기
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine()," ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (cabbage[i][j] == 1 && !visit[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[] { x, y });

        while (!q.isEmpty()) {
            x = q.peek()[0];
            y = q.peek()[1];
            visit[x][y] = true;
            q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (!visit[nx][ny] && cabbage[nx][ny] == 1) {
                        q.add(new int[] { nx, ny });
                        visit[nx][ny] = true;
                    }
                }

            }

        }
    }
}