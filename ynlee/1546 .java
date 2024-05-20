import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] a = new double[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextDouble();
        }
        double maxScore = Arrays.stream(a).max().orElse(0);
        double sum = Arrays.stream(a).map(a2 -> a2 / maxScore * 100).sum();

        System.out.println(sum/N);
        sc.close();
    }
}
