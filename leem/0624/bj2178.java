import java.io.*;
import java.util.*;

public class bj2178{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] maze = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        System.out.println(bfs(maze, N, M));
    }

    private static int bfs(int[][] maze, int N, int M) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 양방향
        boolean[][] visited = new boolean[N][M]; // 방문여부 저장
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                if (x == N - 1 && y == M - 1) {
                    return count;
                }

                for (int[] direction : directions) {
                    int nx = x + direction[0];
                    int ny = y + direction[1];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && maze[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}