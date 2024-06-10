import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args)  {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		Stack<Integer> stack = new Stack<>();
		int num = 1;
//		String result = "";
		boolean test = true;
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<n; i++) {
			//A[i] = Integer.parseInt(br.readLine());
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<A.length; i++) {
			int now = A[i];
			if(now >= num) {
				while(now >= num) {
					stack.push(num);
					result.append("+\n");
					num ++;
				}
				stack.pop();
				result.append("-\n");
			}
			else {
				int popResult = stack.pop();
				if(popResult == now) {
					result.append("-\n");
				}
				else {
					test = false;
					break;
				}
			}
		}
		if(test)
			System.out.println(result);
		else
			System.out.println("NO");
		
		
	}

}
