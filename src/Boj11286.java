import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> Q = new PriorityQueue<>((o1, o2)->{
            int o1_abs = Math.abs(o1);
            int o2_abs = Math.abs(o2);
            if(o1_abs == o2_abs){
                return o1 > o2 ? 1 : -1;    // 절댓값이 같은 경우 음수 우선
            }
            return o1_abs - o2_abs;         // 절댓값 작은 수 우선
        });
        for (int i = 0; i < N; i++) {
            int R = sc.nextInt();
            if (R == 0){
                if (Q.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(Q.poll());
                }
            }else {
                Q.add(R);
            }
        }
    }


}
