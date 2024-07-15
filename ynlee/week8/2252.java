import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer>[] maze = new ArrayList[N + 1]; 
        int[] inDegree = new int[N + 1]; 
        for (int i = 1; i <= N; i++) {
            maze[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            maze[a].add(b); 
            inDegree[b]++; 
        }

        System.out.println(topologicalSort(maze, inDegree, N));
    }

    static String topologicalSort(List<Integer>[] maze, int[] inDegree, int N) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int next : maze[current]) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.add(next);
                }
            }
        }

        return sb.toString().trim();
    }
}
