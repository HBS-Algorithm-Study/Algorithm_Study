import java.util.Scanner;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int num = 1;            // 오름차순 자연수
        boolean result = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();    // 주어진 정수 배열
        }
        Stack<Integer> st = new Stack<>();
        StringBuffer bf = new StringBuffer();

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= num) {
                while(a[i]>=num){
                    st.push(num++);     // 주어진 정수와 오름차순 자연수가 같아질 때까지 push
                    bf.append("+\n");   // '+' 표시
                }
                st.pop();               // 마지막에 들어간 정수 pop
                bf.append("-\n");       // '-' 표시
            } else {
                int b = st.pop();       // 주어진 정수보다 오름차순 자연수가 클 경우 pop
                if (b>a[i]) {
                    System.out.println("NO");   // 주어진 정수가 오름차순 자연수보다 작을 경우 NO 출력
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
