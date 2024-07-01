import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 시험 본 과목 수
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) { // 시험 본 과목 각 점수 입력
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int j = 1; j < arr.length; j++) { // 최대값 구하기
            if(max < arr[j]) {
                max = arr[j];
            }
        }

        double[] arr1 = new double[N];
        for (int k = 0; k < N; k++) {
            arr1[k] = (double) arr[k] / max * 100;
        } // 점수가 낮게 나온 값을 값 / 최대값 * 100 의 형태로 변환

        double total = 0;
        for(int l = 0; l < arr1.length; l++) {
            total += arr1[l];
        }
        double average = total / arr1.length;
        System.out.println(average);
    }
}
