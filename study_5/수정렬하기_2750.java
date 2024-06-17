package study_5;
//버블 정렬시 하나의 루프에서 swap이 한번도 발생하지 않는 경우, 정렬 완료

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){ // 정렬할 숫자들 입력받기
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<N; i++){
            boolean isSwap = false;
            for(int j=0; j<N-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
     
        }

        for(int i=0; i<N; i++){ 
            System.out.println(arr[i]);
        }

    }
    
}
