import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//수의 개수
		int M = sc.nextInt();	//구해야 하는 횟수
		
		int[] num = new int[N];
		int[] sum = new int[N];
		int[] result = new int[M];
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
			if(i == 0)
				sum[i] = num[i];
			else
				sum[i] = sum[i-1] + num[i];
		}
			
		int i, j;
		for(int k=0; k<M; k++) {
			i = sc.nextInt()-2;
			j = sc.nextInt()-1;
			if(i<0) 
				result[k] = sum[j];
			else
				result[k] = sum[j] - sum[i];
		}
		for(int k=0; k<M; k++) {
			System.out.println(result[k]);
		}
		
		
	}



    /*
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 계산 많은 경우, int형은 범위 넘어갈 가능성 존재
        // 첫번째 데이터를 1번 인덱스에 저장하기위해 +1
        long[] S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=1; i<=suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i=0; i<quizNo; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[y] - S[x-1]);
        }
    }
    
}

    
    */ 

}