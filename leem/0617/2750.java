/*문제*/
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

/*입력*/
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

/*출력*/
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int[] arr = new int[N];

//         for(int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }
//         quickSort(arr, 0, N - 1);
//         for(int i = 0; i < N; i++) {
//             System.out.println(arr[i]);
//         }
//     }
//     private static void quickSort(int[] arr, int lo, int hi) {
//         if (lo < hi) {
//             int pi = partition(arr, lo, hi);
//             quickSort(arr, lo, pi - 1);
//             quickSort(arr, pi + 1, hi);
//         }
//     }

//     private static int partition(int[] arr, int left, int right) {
//         int pivot = arr[right];
//         int lo = left - 1;

//         for (int j = left; j < right; j++) {
//             if (arr[j] <= pivot) {
//                 lo++;
//                 swap(arr, lo, j);
//             }
//         }
//         swap(arr, lo + 1, right);
//         return lo + 1;
//     }

//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(br.readLine());
        int[] OrderArr = new int[N];
        for(int i =0 ; i<N; i++) {
            OrderArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(OrderArr);

        for (int arr : OrderArr) {
            System.out.println(arr);
        }
        br.close();
    }
}