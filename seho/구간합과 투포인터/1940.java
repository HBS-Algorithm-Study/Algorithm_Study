import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N]; 
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;                   // 정답을 담을 count
        Arrays.sort(arr);               // 이진탐색을 위한 정렬
        for(int i=0; i<N; i++){         // for문을 돌며 
            int temp = M-arr[i];        // arr[i]+temp=M 이 되는 temp값을 이진검색으로 탐생
            int findIndex = Arrays.binarySearch(arr, temp);
            if(findIndex>=0 && findIndex!=i){   // 해당 값이 존재하고 중복이 아니면 count= count+1 
                count++;
            }
        }
        System.out.println(count/2);
    }
}