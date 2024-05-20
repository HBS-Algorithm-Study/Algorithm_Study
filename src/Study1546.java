package Baekjoon;

import java.util.Scanner;

public class Study1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S[] = new int[N];
        int M = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            S[i] += sc.nextInt();
            if (S[i] >= M) M = S[i];
            sum += S[i];
        }

        System.out.println((double)sum*100/M/N);
    }
}