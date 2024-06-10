import java.util.Scanner;

// Queue 말고 StringBuilder로 풀어보기
// 시간 초과 발생
public class 카드2_2164_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(i);
        }

        // 남은 카드 수가 1이 될 때까지
        while(sb.length()>1){
            sb.deleteCharAt(0); // 첫번째 카드 버리기
            String second = String.valueOf(sb.charAt(0));    //두번째 카드
            sb.deleteCharAt(0);
            sb.append(second);

        }
        System.out.println(sb.charAt(0));
        sc.close();

    }
    
}
