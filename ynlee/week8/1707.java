import java.io.*;
import java.util.*;

//	V: 정점의 수
//	E: 간선의 수
//	E개의 간선 정보: 각 간선은 두 정점 u와 v로 표현

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < K; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken()); 
            int E = Integer.parseInt(st.nextToken()); 

            List<Integer>[] maze = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                maze[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                maze[u].add(v);
                maze[v].add(u);
            }

            System.out.println(isBipartite(maze, V) ? "YES" : "NO");
        }
    }

    public static boolean isBipartite(List<Integer>[] maze, int V) {
        int[] group = new int[V + 1]; 
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= V; i++) {
            if (group[i] != 0) continue;
            queue.add(i);
            group[i] = 1;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int m : maze[node]) {
                    if (group[m] == 0) {
                        group[m] = -group[node];
                        queue.add(m);
                    } else if (group[m] == group[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
