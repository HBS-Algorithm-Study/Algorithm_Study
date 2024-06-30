import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);	//배열 정렬
		
		int i=0, j=N-1;
		int count = 0;
		while(i<j) {
			int sum = A[i] + A[j];
			if(sum == M) {
				count++;
				i++;
				j--;
			}else if(sum < M) {
				i++;
			}else {
				j--;
			}
				
		}
		System.out.println(count);
	}

}