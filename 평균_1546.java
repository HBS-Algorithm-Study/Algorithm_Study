import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//과목 수
		int[] scores = new int[n];	//과목 점수
		int max = 0;	//최고점
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			scores[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(max < scores[i])
				max = scores[i];
		}
		
		for(int i=0; i<n; i++) {
			sum += (double)scores[i]/max*100;
		}
		
		
		System.out.println(sum/n);
	}

}