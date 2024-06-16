import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Boj1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] digits = new int[N.length()];
//        // 방법 1)
//        for (int i = 0; i < N.length(); i++){
//            digits[i] = N.charAt(i) - '0';
//        }
//        Integer[] answer = Arrays.stream(digits).boxed().toArray(Integer[]::new);
//        Arrays.sort(answer, Collections.reverseOrder());
//        for (int i = 0; i < answer.length; i++) {
//            System.out.print(answer[i]);
//        }

        // 방법 2) 선택 정렬
        for (int i = 0; i < N.length(); i++) {
            digits[i] = Integer.parseInt(N.substring(i,i+1));
        }
        for (int i = 0; i < N.length(); i++) {
            int Max = i;
            for (int j = i+1; j < N.length(); j++) {
                if(digits[j]>digits[Max]){
                    Max = j;
                }
            }
            if(digits[i] < digits[Max]){
                int temp = digits[i];
                digits[i] = digits[Max];
                digits[Max] = temp;
            }
        }
        for(int i=0; i<N.length(); i++){
            System.out.print(digits[i]);
        }
    }
}
