package study_7;

import java.util.Scanner;

public class 소수구하기_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] MN = sc.nextLine().split(" ");
        int M = Integer.parseInt(MN[0]);
        int N = Integer.parseInt(MN[1]);

        for(int i=M; i<=N; i++){
            boolean check = false;  //소수인지 아닌지
            if(i==1)
                continue;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    check = true;   //소수 아님
                    break;
                }
            }
            if(!check){
                System.out.println(i);
            }
        }
    }
}
