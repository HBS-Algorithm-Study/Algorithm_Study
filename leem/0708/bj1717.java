import java.io.*;
import java.util.*;


public class bj1717 {
    static int[] parent;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 원소 개수
        int m = Integer.parseInt(st.nextToken()); // 연산 개수
        parent = new int[n + 1]; //1~n 의 구조를 위해서(조건)

        for (int i = 0; i <= n; i++) {
            parent[i] = i; // 각 원소 초기화(자기 자신을 부모)
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (op == 0) { // 0일경우 합집합(조건)
                union(a, b);
            } else if (op == 1) { // 1일경우 같은 집합 확인
                if (find(a) == find(b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        br.close();
    }

    // 같은 집합이 속해 있는지 확인
    static int find(int x) {
        if (parent[x] != x) { // 자기 자신이 대표원소가 아닌경우
            parent[x] = find(parent[x]); // 경로 압축
        }
        return parent[x];
    }

    //합집합(두 집합 합치기)
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            parent[rootY] = rootX;
        }
    }
}
