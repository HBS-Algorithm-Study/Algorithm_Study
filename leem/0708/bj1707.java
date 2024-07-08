import java.util.*;

public class bj1707 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        for (int t = 0; t < K; t++) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < V + 1; i++) {
                graph.add(new ArrayList<>());
            }
            
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            
            if (isBipartite(graph, V)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
    private static boolean isBipartite(List<List<Integer>> graph, int V) {
        int[] colors = new int[V + 1];
        Arrays.fill(colors, 0);
        
        for (int i = 1; i <= V; i++) {
            if (colors[i] == 0) {
                if (!dfs(graph, colors, i, 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean dfs(List<List<Integer>> graph, int[] colors, int node, int color) {
        colors[node] = color;
        for (int n : graph.get(node)) {
            if (colors[n] == 0) {
                if (!dfs(graph, colors, n, -color)) {
                    return false;
                }
            } else if (colors[n] == colors[node]) {
                return false;
            }
        } 
        return true;
    }
}
