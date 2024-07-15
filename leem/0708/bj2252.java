import java.util.*;

public class bj2252 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생수 (1~ N)   
        int M = sc.nextInt(); // 비교 횟수

        graph = new ArrayList[N + 1]; // 학생수 만큼(조건)
        visited = new boolean[N + 1]; // ''
        stack = new Stack<>();

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>(); // 초기화
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            graph[A].add(B); // A->B 간선 추가
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // stack이니까 후입선출 출력
        }
    }

    private static void dfs(int node) { 
        visited[node] = true; 
        for (int n : graph[node]) {
            if (!visited[n]) {
                dfs(n); // dfs 가 종료된 순서대로 push
            }
        }
        stack.push(node);
    }
}
