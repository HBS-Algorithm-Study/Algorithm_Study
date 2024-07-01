import java.lang.*;
import java.util.*;
// public class Main { // 인프런 코딩
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int[] A = new int[N];
//         for(int i = 0 ; i < N; i++) {
//             A[i] = sc.nextInt();
//         }
//         Stack<Integer> stack = new Stack<>();
//         int num = 1;
//         boolean result = true;
//         StringBuffer bf = new StringBuffer();
//         for(int i = 0 ; i <A.length; i++) {
//             int su = A[i];
//             if(su >= num) {
//                 while(su >= num) {
//                     stack.push(num++);
//                     bf.append("+\n");
//                 }
//                 stack.pop();
//                 bf.append("-\n");
//             } else {
//                 int n = stack.pop();
//                 if(n > su) {
//                     System.out.println("NO");
//                     result = false;
//                     break;
//                 } else {
//                     bf.append("-\n");
//                 }
//             }
//         }
//         if(result) System.out.println(bf.toString());
//     }
// }
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] seq = new int[N];
        for (int i = 0; i < N; i++) {
            seq[i] = sc.nextInt();
        } 

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int current = 1;
        for (int i = 0; i < N; i++) {
            int num = seq[i];
            while (current <= num) {
                stack.push(current);
                result.append("+").append("\n");
                current++;
            }
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                result.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(result);
    }
}


