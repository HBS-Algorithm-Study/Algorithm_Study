import java.util.*;

public class bj1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }
        int M = sc.nextInt();
        for(int i = 0 ; i < M; i++) {
            int m_num = sc.nextInt();
            if(set.contains(m_num)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
