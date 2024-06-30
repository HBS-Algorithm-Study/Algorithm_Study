package study_6;

import java.io.*;
import java.util.*;

public class 수찾기_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        String[] strArr1 = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            arrN[i] = Integer.parseInt(strArr1[i]);
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        String[] strArr2 = br.readLine().split(" ");
        for(int i=0; i<M; i++){
            arrM[i] = Integer.parseInt(strArr2[i]);
        }
        //입력


        //이진탐색은 정렬된 데이터여야함
        Arrays.sort(arrN);

        //출력
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            int target = arrM[i];

            int start = 0;
            int end = N-1;
            boolean found = false;
            while(start<=end){
                int mid = (start+end)/2;
                if(arrN[mid] == target){
                    found = true;
                    sb.append(1+"\n");
                    break;
                }
                else if(arrN[mid] < target){
                    start = mid+1;
                }
                else{  //arrN[mid] > target
                    end = mid -1;
                }
            }
            if(!found){
                sb.append(0+"\n");
            }
        }


        System.out.println(sb);


    }
}
