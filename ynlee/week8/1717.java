import java.io.*;

public class Main {
    private static int[] p;
    private static int[] r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] Line = br.readLine().split(" ");
        int n = Integer.parseInt(Line[0]);
        int m = Integer.parseInt(Line[1]);

        p = new int[n + 1];
        r = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            p[i] = i;
            r[i] = 0;
        }


        for (int i = 0; i < m; i++) {
            String[] operation = br.readLine().split(" ");
            int cmd = Integer.parseInt(operation[0]);
            int a = Integer.parseInt(operation[1]);
            int b = Integer.parseInt(operation[2]);

            if (cmd == 0) {
                int A = find(a);
                int B = find(b);
                if (A != B) {
                    if (r[A] > r[B]) {
                        p[B] = A;
                    } else if (r[A] < r[B]) {
                        p[A] = B;
                    } else {
                        p[B] = A;
                        r[A]++;
                    }
                }
            } else if (cmd == 1) {
                if (find(a) == find(b)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.print(sb.toString());
    }

    private static int find(int x) {
        int root = x;
        while (root != p[root]) {
            root = p[root];
        }
        while (x != root) {
            int next = p[x];
            p[x] = root;
            x = next;
        }
        return root;
    }
}
