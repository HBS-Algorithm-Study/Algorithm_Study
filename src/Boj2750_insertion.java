import java.util.Scanner;

public class Boj2750_insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 두번째부터 마지막까지 반복
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            // key가 삽입될 때까지 앞 요소들과 비교
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
        for (int i : A) {
            System.out.println(i);
        }
    }
}
