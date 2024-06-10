import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);   // 순서대로 큐에 정수 넣기
        }
        while(queue.size()>1){          // * queue에 한개만 남을 때까지
            queue.poll();               // 가장 맨 위의 정수 버리기
            queue.add(queue.poll());    // 그 다음 정수 빼낸 후 다시 넣기
        }
        System.out.println(queue.poll());

    }
}
