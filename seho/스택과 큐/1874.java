import java.util.Scanner;
import java.util.Stack;

class 스택수열1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>(); // 스택 선언
        StringBuilder sb = new StringBuilder(); // 문자열 저장을 위한 StringBuilder
        boolean b = true;   // 불가능한 경우 false
        int num = 1;        // 스택에 저장하게될 수
        for (int i = 0; i < N; i++) {
            while (num < arr[i]) {  // 필요한 수까지 push   
                st.push(num);
                sb.append("+");
                num++;
            }
            if (arr[i] == num) { // 같을경우 pop
                st.push(num);
                sb.append("+");
                num++;
                st.pop();
                sb.append("-");
            } else {    
                int temp = st.pop();
                sb.append("-");
                if (arr[i] != temp) {   // 틀릴경우 break NO 출력
                    System.out.println("NO");
                    b = false;
                    break;
                }
            }
        }
        if(b){  //NO가 아니면 결과 출력
            String temp = sb.toString();
            for(String i:temp.split("")){
                System.out.println(i);
            }
        }
    }
}

