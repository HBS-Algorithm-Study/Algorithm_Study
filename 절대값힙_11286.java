import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//우선순위 큐 커스터마이징 하는 방법!
public class 절대값힙_11286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>( (o1, o2)->{	//o1 o2는 비교 대상
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if(first_abs == second_abs) {	//절대값이 같은 경우 음수 우선
				return o1 > o2 ? 1: -1;
			}
			//절대값이 작은 데이터 우선
			return first_abs - second_abs;	//오름차순. 내림차순은 second - first
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(pq.isEmpty()) {
					sb.append("0\n");
				}else {
					sb.append(pq.poll()+"\n");
				}
			}else {
				pq.offer(x);
			}
			
		}
		System.out.println(sb);
	}

}