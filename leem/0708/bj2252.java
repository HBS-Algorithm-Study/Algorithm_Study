import java.util.*;

public class bj2252 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        stack = new Stack<>();

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            graph[A].add(B);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static void dfs(int node) {
        visited[node] = true;
        for (int n : graph[node]) {
            if (!visited[n]) {
                dfs(n);
            }
        }
        stack.push(node);
    }
}
