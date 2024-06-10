import java.util.*;


// public class Main { //인프런 코딩
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2) -> {
//             int first_abs = Math.abs(o1);
//             int second_abs = Math.abs(o2);
//             if(first_abs == second_abs) {
//                 return o1 > o2 ? 1 : -1;
//             }
//             return first_abs - second_abs;
//         });
//         for(int i = 0 ; i < N; i++) {
//             int request = Integer.parseInt(br.readLine());
//             if(request == 0) {
//                 if(myQueue.isEmpty()) {
//                     System.out.println("0");
//                 } else {
//                     System.out.println(myQueue.poll());
//                 }
//             } else {
//                 myQueue.add(request);
//             }
//         }
//     }
// }
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a) == Math.abs(b)) {
                return Integer.compare(a, b); //a > b ? 1 : -1;
            }
            return Integer.compare(Math.abs(a), Math.abs(b));
        });

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x != 0) {
                queue.offer(x);
            } else {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            }
        }
    }
}

