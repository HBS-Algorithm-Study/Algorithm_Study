/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String numStr = sc.next();

        int total = 0;

        for (int i = 0; i < N; i++) {
            total += Character.getNumericValue(numStr.charAt(i));
        }

        System.out.println(total);
    }
}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        String numStr = br.readLine().trim(); // 조건이 공백없이 이기 때문에 trim, replaceAll, split 중 가장 쉬운 trim 사용
        // 문자가 아스키코드 값으로 저장 (ex 1 -> 49)
        int total = 0; 

        for (int i = 0; i < N; i++) {
            total += Character.getNumericValue(numStr.charAt(i));
            // total = total + Character.getNumericValue(numStr.charAt(i));
            // 저장된 숫자(아스키코드 ) 을 다시 숫자형태로 반환 시켜줌
            // String으로 저장된 문자열 중 단 하나만을 char 타입으로 변환 출력 = charAt()
        }

        System.out.println(total);
    }
}
