import java.lang.*;
import java.util.*;
// public class Main { //시간초과
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         Stack<Integer> stack = new Stack<>();
//         for (int i = N; i >= 1; i--) {
//             stack.push(i);
//         }
//         while (stack.size() != 1) {
//             stack.pop();
//             int topCard = stack.pop();
//             stack.add(0, topCard);
//         }
//         System.out.println(stack.peek());
//     }
// }
// public class Main {// 인프런 코딩
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Queue<Integer> myQueue = new LinkedList<>();
//         int N = sc.nextInt();
//         for(int i = 1; i <= N; i++) {
//             myQueue.add(i);
//         }
//         while(myQueue.size() > 1) {
//             myQueue.poll();
//             int temp = myQueue.poll();
//             myQueue.add(temp);
//         }
//         System.out.println(myQueue.poll());
//     }
// }

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            int topCard = queue.poll();
            queue.offer(topCard);
        }
        System.out.println(queue.peek());
    }
}

