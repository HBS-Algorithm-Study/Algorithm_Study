package study_5;

import java.io.*;


public class Main {
    public static int[] arr;
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //System.out.println(Arrays.toString(arr));
        mergeSort(0, N-1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < arr.length; i++) {
			bw.write(Integer.toString(arr[i]) + "\n");

		}
		bw.close();
        //System.out.println(Arrays.toString(arr));


    }

    public static void mergeSort(int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            merge(start, mid, end);
        }
    }

    public static void merge(int start, int mid, int end){
        int index = start;
        int p = start;
        int q = mid+1;

        while(p<=mid && q<=end){
            if(arr[p] < arr[q]){
                tmp[index++] = arr[q++];
            }
            else{
                tmp[index++] = arr[p++];
            }
        }

        while(p>mid && q<=end){
            tmp[index++] = arr[q++];
        }
        while(q>end && p<=mid){
            tmp[index++] = arr[p++];
        }

        for(int i=start; i<=end; i++){
            arr[i] = tmp[i];
        }
    }
}

