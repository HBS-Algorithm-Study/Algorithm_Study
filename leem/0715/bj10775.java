import java.util.*;

public class bj10775 {
    private static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int G = sc.nextInt(); // 게이트 수(입력)
        int P = sc.nextInt(); // 비행기 수(입력)
        
        parent = new int[G + 1];
        for (int i = 1; i <= G; i++) {
            parent[i] = i;
        }
        int docking = 0; // 도킹 가능한 비행기 
        for (int i = 0; i < P; i++) { 
            int gate = sc.nextInt(); // 도킹가능한 최대 게이트 범위(입력)
            int possibleG = find(gate);
            if (possibleG == 0) { // 비행기가 어느 게이트에도 도킹할 없는 경우 종료 (조건)
                break;
            }
            union(possibleG, possibleG - 1);
            docking++;
        }
        System.out.println(docking); // 결과
        sc.close();
    }
    
    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    
    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[a] = b;
        }
    }
}
