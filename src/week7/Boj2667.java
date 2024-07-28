package week7;
import java.util.*;
import java.io.*;

public class Boj2667 {
    // 단지 번호 붙이기
    // DFS
    static int[][] danji;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> answer;
    static int count, N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        answer = new LinkedList<>();
        N = Integer.parseInt(br.readLine());    // N: 지도의 크기
        danji = new int[N][N];
        visited = new boolean[N][N];
        count = 1;

        // 집 위치 입력받기
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                danji[i][j] = str.charAt(j)-'0';
            }
        }
        for(int x=0; x<N; x++) {
            for(int y=0; y<N; y++) {
                if(danji[x][y] == 1 && !visited[x][y]) {
                    dfs(x,y);
                    answer.add(count);
                    count = 1;
                }
            }
        }
        Collections.sort(answer);

        bw.write(answer.size()+"\n");
        for(int a : answer) bw.write(a+"\n");
        bw.flush();
        bw.close();
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && danji[nx][ny]==1) {
                count++;
                dfs(nx,ny);
            }
        }
    }
}
