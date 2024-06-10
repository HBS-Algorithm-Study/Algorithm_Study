import java.util.*;

class 카드게임2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (true){
            Integer temp1 = queue.poll();
            Integer temp2 = queue.poll();
            if(temp2 == null){
                System.out.println(temp1);
                break;
            }else {
                queue.add(temp2);
            }
        }
    }
}
