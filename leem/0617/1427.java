import java.util.*;
import java.io.*;
/* 문제 */
// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
/* 입력 */
// 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
/* 출력 */
// 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.


/* case1 */
// public class 1427 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
        
//         String[] s = String.valueOf(N).split("");

//         Arrays.sort(s, Collections.reverseOrder());
//         for (String str : s) {
//             System.out.print(str);
//         }
//     }
// }

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();
        sc.close();

        char[] c = N.toCharArray();
        quickSort(c, 0, c.length - 1);
        System.out.println(new String(c));
    }

    private static void quickSort(char[] arr, int lo, int hi) {
        if (lo < hi) {
            int pi = partition(arr, lo, hi);
            quickSort(arr, lo, pi - 1);
            quickSort(arr, pi + 1, hi);
        }
    }

    private static int partition(char[] arr, int left, int right) {
        char pivot = arr[right];
        int lo = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] >= pivot) {
                lo++;
                swap(arr, lo, j);
            }
        }
        swap(arr, lo + 1, right);
        return lo + 1;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}