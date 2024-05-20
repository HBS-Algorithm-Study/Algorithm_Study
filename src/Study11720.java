package Baekjoon;

import java.util.Scanner;

public class Study11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] L = S.toCharArray();
        int sum = 0;
        for (int i = 0; i < L.length; i++) {
            sum += Character.getNumericValue(L[i]);
        }
        System.out.println(sum);
    }
}
